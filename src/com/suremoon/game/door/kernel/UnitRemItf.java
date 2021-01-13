package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.UnitItf;

public interface UnitRemItf {
    void underAttack(UnitItf attacker, double hurt);
    void forgetUnit(UnitItf u);
    UnitRemItf Null = new UnitRemNothing();
}

class UnitRemNothing implements UnitRemItf{

    @Override
    public void underAttack(UnitItf attacker, double hurt) {

    }

    @Override
    public void forgetUnit(UnitItf u) {

    }
}