package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.attribute.ComplexAttribute;
import com.suremoon.game.door.kernel.AGTypeInf;
import com.suremoon.game.door.kernel.DieDo;
import com.suremoon.game.door.kernel.GRectItf;
import com.suremoon.game.door.kernel.UnitRemItf;
import com.suremoon.game.door.kernel.enums.LeaveStatus;

public interface UnitItf extends AGTypeInf, GRectItf {

    /**TODO： 将来想要把伤害抽象为一个类
     * @param attacker 攻击者
     * @param ad AD伤害
     * @param ap AP伤害
     */
    void underAttack(UnitItf attacker, double ad, double ap);

    /**
     * @return 是否已死亡
     */
    boolean isDie();

    ComplexAttribute getAttribute();

    void setAttribute(ComplexAttribute attrib);

    StateItf getState();

    void setState(StateItf state);

    void acceptBuff(BuffItf buff);
    void acceptCmd(CommandItf cmd);
    void setUnitRem(UnitRemItf itf);
    UnitRemItf getUnitRem();

    /**
     * @return 唯一ID
     */
    int getGid();

    void setGid(int gid);

    /**
     * @return 动画间隔时间
     */
    int getIntervalTime();

    /**
     * @param hel 治疗
     */
    void BeHeal(double hel);

    void setDieDo(DieDo dieDo);

    /**
     * 重生
     */
    void relive();

    void setShowName(String showName);
    String getShowName();

    LeaveStatus getLeaveStatus();

    void setLeaveStatus(LeaveStatus leaveStatus);

    /**
     * @param unitLeaveAction 当玩家设置为离开，被移除当前世界之后做什么
     */
    void setLeaveAction(UnitLeaveAction unitLeaveAction);
    UnitLeaveAction getLeaveAction();

    /**
     * @return 玩家所属的阵营
     */
    int getCamp();

    /**
     * @param camp 玩家所属的阵营
     */
    void setCamp(int camp);
}
