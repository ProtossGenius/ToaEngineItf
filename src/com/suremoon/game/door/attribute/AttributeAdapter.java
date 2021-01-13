package com.suremoon.game.door.attribute;

/**
 * Created by Water Moon on 2018/3/7.
 * todo: Need to be changed to use a script to generate
 */
public class AttributeAdapter extends SMAttribute{
    /**
     *HP = 0, MP = 1, AP = 2, AD = 3, INT = 魔抗, DEF = 物抗, SPD = 速度, AGI = 敏捷（命中和闪避）, MAX_HP = 8, MAX_MP = 9;
     */
    public static final int HP = 0, MP = 1, AP = 2, AD = 3, INT = 4, DEF = 5, SPD = 6, AGI = 7, MAX_HP = 8, MAX_MP = 9;
    public AttributeAdapter(){
        super(10);
    }

    public double getHp() {
        return getAttribute(HP);
    }

    public void setHp(double hp) {
        setAttribute(HP, hp);
    }

    public double getMaxHp(){
        return getAttribute(MAX_HP);
    }

    public void setMaxHp(double maxHp){
        setAttribute(MAX_HP, maxHp);
    }

    public double getMp() {
        return getAttribute(MP);
    }

    public void setMp(double mp) {
        setAttribute(MP, mp);
    }

    public double getMaxMp(){
        return getAttribute(MAX_HP);
    }

    public void setMaxMp(double maxMp){
        setAttribute(MAX_MP, maxMp);
    }

    public double getAp() {
        return getAttribute(AP);
    }

    public void setAp(double ap) {
        setAttribute(AP, ap);
    }

    public double getAd() {
        return getAttribute(AD);
    }

    public void setAd(double ad) {
        setAttribute(AD, ad);
    }

    public double getInt() {
        return getAttribute(INT);
    }

    public void setInt(double value) {
        setAttribute(INT, value);
    }

    public double getDef() {
        return getAttribute(DEF);
    }

    public void setDef(double def) {
        setAttribute(DEF, def);
    }

    public double getSpd() {
        return getAttribute(SPD);
    }

    public void setSpd(double spd) {
        setAttribute(SPD, spd);
    }

    public double getAgi() {
        return getAttribute(AGI);
    }

    public void setAgi(double agi) {
        setAttribute(AGI, agi);
    }
}
