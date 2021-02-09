package main

import (
	"fmt"
	"strings"
	"time"

	"github.com/ProtossGenius/SureMoonNet/basis/smn_file"
	"github.com/ProtossGenius/pglang/analysis/lex_pgl"
	"github.com/ProtossGenius/pglang/snreader"
)

const adapterPath = "../src/com/suremoon/game/door/attribute/AttributeAdapter.java"

const complexPath = "../src/com/suremoon/game/door/attribute/ComplexAttribute.java"

const descFlag = "#ATTRIB_LIST"

const adapterCodeHead = `package com.suremoon.game.door.attribute;

/**
 * @Note:    this file product by tools, you should only change the comment about ATTRIB_LIST,
 * 	           your another change will be cover.
 * @Author:  ProtossGenius
 *
 * @Time:    %s
 */
public class AttributeAdapter extends SMAttribute{ 
`

const complexCodeHead = `package com.suremoon.game.door.attribute;

/**
 * @Note:    this file product by tools, you should change nothing in here,
 *             or your changes will be cover.
 * @Author:  ProtossGenius
 *
 * @Time:    %s
 */
public class ComplexAttribute extends AttributeAdapter{
    AttributeAdapter extra;

    public ComplexAttribute(){
        super();
        this.extra = new AttributeAdapter();
    }

    public ComplexAttribute(AttributeAdapter itself) {
        super(itself);
        this.extra = new AttributeAdapter();
    }

    public ComplexAttribute(AttributeAdapter itself, AttributeAdapter extra) {
        super(itself);
        this.extra = extra;
    }
    
    public AttributeAdapter getExtra() {
        return extra;
    }

`

func check(err error) {
	if err != nil {
		panic(err)
	}
}

func getAttribDescs() (comment, desc string) {
	data, err := smn_file.FileReadAll(adapterPath)
	check(err)

	sm := lex_pgl.NewLexAnalysiser()

	go func() {
		for _, char := range string(data) {
			check(sm.Read(&lex_pgl.PglaInput{Char: char}))
		}

		sm.End()
	}()

	rc := sm.GetResultChan()

	for {
		result := <-rc
		if result.ProductType() == snreader.ResultEnd {
			break
		}

		lex := lex_pgl.ToLexProduct(result)

		if lex_pgl.IsComment(lex) {
			if !strings.HasPrefix(lex.Value, "/*") {
				continue
			}

			desc = strings.TrimSpace(lex.Value[2 : len(lex.Value)-2])

			if strings.HasPrefix(desc, descFlag) {
				return lex.Value, desc[len(descFlag):]
			}
		}
	}

	return "", ""
}

// AttribPair attrib's value-name&comment.
type AttribPair struct {
	Name string
	Desc string
}

func analysis(desc string) []*AttribPair {
	const splitNum = 2

	desc = strings.ReplaceAll(desc, "\n", "")
	toList := strings.Split(desc, ",")
	res := make([]*AttribPair, 0, len(toList))

	for _, one := range toList {
		one = strings.TrimSpace(one)
		if one == "" {
			continue
		}

		two := strings.SplitN(one, "=", splitNum)

		pair := &AttribPair{Name: two[0], Desc: ""}

		if len(two) == splitNum {
			pair.Desc = two[1]
		}

		res = append(res, pair)
	}

	return res
}

func writeToAdapter(comment string, attribList []*AttribPair) {
	file, err := smn_file.CreateNewFile(adapterPath)
	check(err)

	defer file.Close()

	write := func(f string, a ...interface{}) {
		_, err = file.Write(([]byte)(fmt.Sprintf(f+"\n", a...)))
		check(err)
	}
	write(adapterCodeHead, time.Now().Format("2006-01-02 15:04:05"))
	write(comment)

	index := 0

	for _, attrib := range attribList {
		write("\t/** %s %s.*/", attrib.Name, attrib.Desc)
		write("\tpublic static final int %s = %d;", attrib.Name, index)
		index++
	}

	write("\tpublic AttributeAdapter(){ super(%d); }", index)
	write("\tpublic AttributeAdapter(AttributeAdapter another){super(another);}")

	for _, attrib := range attribList {
		write("\t/** 设置%s. */", attrib.Desc)
		write("\tpublic void set%s(double _%s){setAttribute(%s, _%s);}",
			attrib.Name, strings.ToLower(attrib.Name), attrib.Name, strings.ToLower(attrib.Name))
		write("\t/** 获得%s. */", attrib.Desc)
		write("\tpublic double get%s(){ return getAttribute(%s); }", attrib.Name, attrib.Name)
	}

	write("}\n")
}

func writeToComplex(attribList []*AttribPair) {
	file, err := smn_file.CreateNewFile(complexPath)
	check(err)

	defer file.Close()

	write := func(f string, a ...interface{}) {
		_, err = file.Write(([]byte)(fmt.Sprintf(f+"\n", a...)))
		check(err)
	}
	write(complexCodeHead, time.Now().Format("2006-01-02 15:04:05"))

	for _, attrib := range attribList {
		write("\t/** 获得%s. */", attrib.Desc)
		write("\tpublic double get%s(){ return get%s() + extra.get%s(); }", attrib.Name, attrib.Name, attrib.Name)
	}

	write("}\n")
}

func main() {
	comment, attribDescs := getAttribDescs()
	pairs := analysis(attribDescs)
	writeToAdapter(comment, pairs)
	writeToComplex(pairs)
}
