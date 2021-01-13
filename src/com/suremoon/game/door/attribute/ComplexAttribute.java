package com.suremoon.game.door.attribute;

/**
 * Created by Water Moon on 2018/3/9.
 */
public class ComplexAttribute extends AttributeAdapter{
    AttributeAdapter itself, extra;

    public ComplexAttribute(AttributeAdapter itself) {
        this.itself = itself;
        this.extra = new AttributeAdapter();
    }

    public ComplexAttribute(AttributeAdapter itself, AttributeAdapter extra) {
        this.itself = itself;
        this.extra = extra;
    }
    
    public AttributeAdapter getExtra() {
        return extra;
    }

    @Override
    public double getHp() {
        return itself.getHp() + extra.getHp();
    }

    @Override
    public double getMaxHp() {
        return itself.getMaxHp() + extra.getMaxHp();
    }

    @Override
    public double getMp() {
        return itself.getMp() + extra.getMp();
    }

    @Override
    public double getMaxMp() {
        return itself.getMaxMp() + extra.getMaxMp();
    }

    @Override
    public double getAp() {
        return itself.getAp() + extra.getAp();
    }

    @Override
    public double getAd() {
        return itself.getAd() + extra.getAp();
    }

    @Override
    public double getInt() {
        return itself.getInt() + extra.getInt();
    }

    @Override
    public double getDef() {
        return itself.getDef() + extra.getDef();
    }

    @Override
    public double getSpd() {
        return itself.getSpd() + extra.getSpd();
    }

    @Override
    public double getAgi() {
        return itself.getAgi() + extra.getAgi();
    }

    @Override
    public void setHp(double hp) {
        itself.setHp(hp);
    }

    @Override
    public void setMaxHp(double maxHp) {
        itself.setMaxHp(maxHp);
    }

    @Override
    public void setMp(double mp) {
        itself.setMp(mp);
    }

    @Override
    public void setMaxMp(double maxMp) {
        itself.setMaxMp(maxMp);
    }

    @Override
    public void setAp(double ap) {
        itself.setAp(ap);
    }

    @Override
    public void setAd(double ad) {
        itself.setAd(ad);
    }

    @Override
    public void setInt(double value) {
        itself.setInt(value);
    }

    @Override
    public void setDef(double def) {
        itself.setDef(def);
    }

    @Override
    public void setSpd(double spd) {
        itself.setSpd(spd);
    }

    @Override
    public void setAgi(double agi) {
        itself.setAgi(agi);
    }
}
