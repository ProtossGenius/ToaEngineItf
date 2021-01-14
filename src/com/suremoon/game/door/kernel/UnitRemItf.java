package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.UnitItf;

public interface UnitRemItf extends CalcAble{
    void underAttack(UnitItf attacker, double hurt);
    UnitRemItf Null = new UnitRemNothing();
}

class UnitRemNothing implements UnitRemItf{

    @Override
    public void underAttack(UnitItf attacker, double hurt) {

    }

    @Override
    public void doCalc(WorldItf world, WorldMgrItf worldMgr) {

    }
}