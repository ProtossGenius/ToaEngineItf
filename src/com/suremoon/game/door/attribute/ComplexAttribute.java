package com.suremoon.game.door.attribute;

/**
 * @Note:    this file product by tools, you should change nothing in here,
 *             or your changes will be cover.
 * @Author:  ProtossGenius
 *
 * @Time:    2021-02-09 14:38:04
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


	/** 获得 血量. */
	public double getHp (){ return super.getHp () + extra.getHp (); }
	/** 获得 蓝量. */
	public double getMp (){ return super.getMp () + extra.getMp (); }
	/** 获得 魔法. */
	public double getAp (){ return super.getAp () + extra.getAp (); }
	/** 获得 物理. */
	public double getAd (){ return super.getAd () + extra.getAd (); }
	/** 获得 魔抗. */
	public double getInt (){ return super.getInt () + extra.getInt (); }
	/** 获得 物抗. */
	public double getDef (){ return super.getDef () + extra.getDef (); }
	/** 获得 速度. */
	public double getSpd (){ return super.getSpd () + extra.getSpd (); }
	/** 获得 敏捷（命中和闪避）. */
	public double getAgi (){ return super.getAgi () + extra.getAgi (); }
	/** 获得 最大血量. */
	public double getMaxHp (){ return super.getMaxHp () + extra.getMaxHp (); }
	/** 获得 最大蓝量. */
	public double getMaxMp (){ return super.getMaxMp () + extra.getMaxMp (); }
}

