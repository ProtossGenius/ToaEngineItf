package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.kernel.AGTypeInf;
import com.suremoon.game.door.kernel.CmdActionItf;
import com.suremoon.game.door.netabout.AGMessageable;

import java.awt.*;

public interface CommandItf extends AGMessageable, AGTypeInf {

    /**
     * ���������ӵ����
     * @param u ӵ����
     * @return ����
     */
    CommandItf setOwner(UnitItf u);

    /**
     * @return �Ƿ���׷�ӵ�����
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
