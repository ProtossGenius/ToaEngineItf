package com.suremoon.game.door.kernel.manager;

import com.suremoon.game.door.units_itf.UnitItf;

public interface UnitDoItf {
    /**
     * @param unit
     * @return true:break, false: continue.
     */
    boolean Do(UnitItf unit);
}
