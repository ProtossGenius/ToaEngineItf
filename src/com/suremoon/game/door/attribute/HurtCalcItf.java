package com.suremoon.game.door.attribute;

import com.suremoon.game.door.units_itf.UnitItf;

public interface HurtCalcItf {
    /**
     * @param sHurt ¹¥»÷·½µÄ¹¥»÷ÊôÐÔ
     * @return
     */
    int underAttack(UnitItf unit, ElementPriorities sHurt);
    HurtCalcItf Null = (unit, sHurt) -> {
        var attr = unit.getAttribute();
        return oneProperty(sHurt.metal, attr.getMetal()) +
                oneProperty(sHurt.wood, attr.getWood()) +
                oneProperty(sHurt.water, attr.getWater()) +
                oneProperty(sHurt.earth, attr.getEarth()) +
                oneProperty(sHurt.thunder, attr.getThunder()) +
                oneProperty(sHurt.water, attr.getWind()) +
                oneProperty(sHurt.ice, attr.getIce());
    };

    static int oneProperty(double s, double m){
        if(m < 0)return (int)s;
        return (int)(s - s / (m + 10));
    }
}
