package com.suremoon.game.door.attribute;

/**
 * Created by Water Moon on 2017/12/7.
 */
public abstract class SMAttribute {
    protected double attributes[];
    public SMAttribute(int attributeNum){
        attributes = new double[attributeNum];
    }
    public int attributeNum(){
        return attributes.length;
    }
    public double getAttribute(int AttributeType){
        return attributes[AttributeType];
    }
    public void setAttribute(int AttributeType, double value){
        attributes[AttributeType] = value;
    }
}
