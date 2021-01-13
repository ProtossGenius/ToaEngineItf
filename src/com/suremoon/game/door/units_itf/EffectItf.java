package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.kernel.AGTypeInf;
import com.suremoon.game.door.kernel.CalcAble;
import com.suremoon.game.door.kernel.EffectActionItf;
import com.suremoon.game.door.kernel.GRectItf;
import com.suremoon.game.door.netabout.AGMessageable;

public interface EffectItf extends GRectItf, AGTypeInf, AGMessageable, CalcAble {
    void setHurt(double ad, double ap);
    UnitItf getEffectPutter();
    void setEffectPutter(UnitItf effectPutter);
    void setEffectType(int effectType);
    int getPassedTime();
    double getHurt_ad();
    double getHurt_ap();
    void setEffectAction(EffectActionItf ea);
}
