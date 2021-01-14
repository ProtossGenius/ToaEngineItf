package com.suremoon.game.door.kernel.manager;

import com.suremoon.game.door.netabout.AGMessage;
import com.suremoon.game.door.units_itf.UnitItf;

import java.awt.*;

/**
 * Created by Water Moon on 2017/11/28.
 */
public interface UnitMgrItf {
    void addUnit(UnitItf unit);
    void removeUnit(UnitItf unit);
    UnitItf[] getUnits();
    UnitItf[] getUnits(Rectangle screenRect);
    boolean   unitsDo(UnitDoItf ud);
    boolean   unitsDo(Rectangle screenRect, UnitDoItf ud);
    AGMessage[] getShowers(Rectangle screenRect);
    UnitItf getUnit(int ugid);
    int size();
}
