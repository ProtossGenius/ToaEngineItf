package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.UnitItf;

// DieDo when unit die, what should do.
public interface DieDo {
    void Do(UnitItf it, WorldItf world, WorldMgrItf worldMgr);
    DieDoNothing DoNothing = new DieDoNothing();
}

// Donothing
class DieDoNothing implements DieDo{
    public DieDoNothing(){}
    @Override
    public void Do(UnitItf it, WorldItf world, WorldMgrItf wm) {

    }
}
