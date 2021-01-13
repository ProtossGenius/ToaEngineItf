package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.kernel.CalcAble;

public interface BuffItf extends CalcAble {

    BuffItf createBuff(UnitItf u);
    void appendBuff(BuffItf buff);
}
