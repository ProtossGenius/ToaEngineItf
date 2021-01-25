package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.kernel.AGTypeInf;
import com.suremoon.game.door.kernel.CmdActionItf;
import com.suremoon.game.door.netabout.AGMessageable;

import java.awt.*;

public interface CommandItf extends AGMessageable, AGTypeInf {

    /**
     * 设置命令的拥有者
     * @param u 拥有者
     * @return 自身
     */
    CommandItf setOwner(UnitItf u);

    /**
     * @return 是否是追加的命令
     */
    boolean isAppendCmd();

    UnitItf getUnit();
    Point getTargetPoint();
    void updateFlagTime();
    long getFlagTime();
    CmdActionItf getCmdAction();
    void setCmdAction(CmdActionItf cmdAction);
    CommandItf setAppendCmd(boolean appendCmd);
    int getTarget();
}
