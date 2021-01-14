package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.UnitItf;

public interface UnitRemItf {
    void underAttack(UnitItf attacker, double hurt);
    void doCalc(UnitItf unit,  WorldItf world, WorldMgrItf worldMgr);
    UnitRemItf Null = new UnitRemNothing();
}

class UnitRemNothing implements UnitRemItf{

    @Override
    public void underAttack(UnitItf attacker, double hurt) {

    }

    @Override
    public void doCalc(UnitItf unit,  WorldItf world, WorldMgrItf worldMgr) {

    }
}