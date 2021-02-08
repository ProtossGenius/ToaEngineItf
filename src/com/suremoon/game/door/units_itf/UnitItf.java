package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.attribute.ComplexAttribute;
import com.suremoon.game.door.kernel.AGTypeInf;
import com.suremoon.game.door.kernel.DieDo;
import com.suremoon.game.door.kernel.GRectItf;
import com.suremoon.game.door.kernel.UnitRemItf;
import com.suremoon.game.door.kernel.enums.LeaveStatus;

public interface UnitItf extends AGTypeInf, GRectItf {

    /**TODO�� ������Ҫ���˺�����Ϊһ����
     * @param attacker ������
     * @param ad AD�˺�
     * @param ap AP�˺�
     */
    void underAttack(UnitItf attacker, double ad, double ap);

    /**
     * @return �Ƿ�������
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
     * @return ΨһID
     */
    int getGid();

    void setGid(int gid);

    /**
     * @return �������ʱ��
     */
    int getIntervalTime();

    /**
     * @param hel ����
     */
    void BeHeal(double hel);

    void setDieDo(DieDo dieDo);

    /**
     * ����
     */
    void relive();

    void setShowName(String showName);
    String getShowName();

    LeaveStatus getLeaveStatus();

    void setLeaveStatus(LeaveStatus leaveStatus);

    /**
     * @param unitLeaveAction ���������Ϊ�뿪�����Ƴ���ǰ����֮����ʲô
     */
    void setLeaveAction(UnitLeaveAction unitLeaveAction);
    UnitLeaveAction getLeaveAction();

    /**
     * @return �����������Ӫ
     */
    int getCamp();

    /**
     * @param camp �����������Ӫ
     */
    void setCamp(int camp);
}
