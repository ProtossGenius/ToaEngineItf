package com.suremoon.game.door.attribute;

/**
 * @Note:    this file product by tools, you should only change the comment about ATTRIB_LIST,
 * 	           your another change will be cover.
 * @Author:  ProtossGenius
 *
 * @Time:    2021-02-09 14:34:02
 */
public class AttributeAdapter extends SMAttribute{ 

/*#ATTRIB_LIST
    Hp = 血量, Mp = 蓝量, Ap = 魔法, Ad = 物理, Int = 魔抗, Def = 物抗, Spd = 速度, Agi = 敏捷（命中和闪避）,
     MaxHp = 最大血量, MaxMp = 最大蓝量
    */
	/** Hp   血量.*/
	public static final int Hp  = 0;
	/** Mp   蓝量.*/
	public static final int Mp  = 1;
	/** Ap   魔法.*/
	public static final int Ap  = 2;
	/** Ad   物理.*/
	public static final int Ad  = 3;
	/** Int   魔抗.*/
	public static final int Int  = 4;
	/** Def   物抗.*/
	public static final int Def  = 5;
	/** Spd   速度.*/
	public static final int Spd  = 6;
	/** Agi   敏捷（命中和闪避）.*/
	public static final int Agi  = 7;
	/** MaxHp   最大血量.*/
	public static final int MaxHp  = 8;
	/** MaxMp   最大蓝量.*/
	public static final int MaxMp  = 9;
	public AttributeAdapter(){ super(10); }
	public AttributeAdapter(AttributeAdapter another){super(another);}
	/** 设置 血量. */
	public void setHp (double _hp ){setAttribute(Hp , _hp );}
	/** 获得 血量. */
	public double getHp (){ return getAttribute(Hp ); }
	/** 设置 蓝量. */
	public void setMp (double _mp ){setAttribute(Mp , _mp );}
	/** 获得 蓝量. */
	public double getMp (){ return getAttribute(Mp ); }
	/** 设置 魔法. */
	public void setAp (double _ap ){setAttribute(Ap , _ap );}
	/** 获得 魔法. */
	public double getAp (){ return getAttribute(Ap ); }
	/** 设置 物理. */
	public void setAd (double _ad ){setAttribute(Ad , _ad );}
	/** 获得 物理. */
	public double getAd (){ return getAttribute(Ad ); }
	/** 设置 魔抗. */
	public void setInt (double _int ){setAttribute(Int , _int );}
	/** 获得 魔抗. */
	public double getInt (){ return getAttribute(Int ); }
	/** 设置 物抗. */
	public void setDef (double _def ){setAttribute(Def , _def );}
	/** 获得 物抗. */
	public double getDef (){ return getAttribute(Def ); }
	/** 设置 速度. */
	public void setSpd (double _spd ){setAttribute(Spd , _spd );}
	/** 获得 速度. */
	public double getSpd (){ return getAttribute(Spd ); }
	/** 设置 敏捷（命中和闪避）. */
	public void setAgi (double _agi ){setAttribute(Agi , _agi );}
	/** 获得 敏捷（命中和闪避）. */
	public double getAgi (){ return getAttribute(Agi ); }
	/** 设置 最大血量. */
	public void setMaxHp (double _maxhp ){setAttribute(MaxHp , _maxhp );}
	/** 获得 最大血量. */
	public double getMaxHp (){ return getAttribute(MaxHp ); }
	/** 设置 最大蓝量. */
	public void setMaxMp (double _maxmp ){setAttribute(MaxMp , _maxmp );}
	/** 获得 最大蓝量. */
	public double getMaxMp (){ return getAttribute(MaxMp ); }
}

