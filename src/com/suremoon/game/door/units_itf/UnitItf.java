package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.attribute.ElementPriorities;
import com.suremoon.game.door.attribute.ComplexAttribute;
import com.suremoon.game.door.attribute.HurtCalcItf;
import com.suremoon.game.door.kernel.AGTypeInf;
import com.suremoon.game.door.kernel.DieDo;
import com.suremoon.game.door.kernel.GRectItf;
import com.suremoon.game.door.kernel.UnitRemItf;
import com.suremoon.game.door.kernel.enums.LeaveStatus;
import com.suremoon.game.door.units_itf.skill_about.SkillManager;

public interface UnitItf extends AGTypeInf, GRectItf {

    void setHurtCalcItf(HurtCalcItf hurtCalc);
    HurtCalcItf getHurtCalcItf();

    /**
     * @return �Ƿ�������
     */
    boolean isDie();

    ComplexAttribute getAttribute();

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

    SkillManager getSkillManager();

// ------------- ������defaultʵ�� ------------
    default void BeHurt(double hurt){
        double hp = this.getAttribute().getHp();
        hp = hp - hurt > 0 ? hp - hurt : 0;
        this.getAttribute().setHp(hp);
    }

    default void underAttack(UnitItf attacker, ElementPriorities elementPriorities) {
        double hurt = getHurtCalcItf().underAttack(this, elementPriorities);
        BeHurt(hurt);
        getUnitRem().underAttack(this, attacker, hurt);
    }

    /**
     * @param attacker ������
     * @param ad AD�˺�
     * @param ap AP�˺�
     */
    default void underAttack(UnitItf attacker, double ad, double ap) {
        underAttack(attacker, new ElementPriorities(ad, ap));
    }

    /**
     *
     * @param skillName ������
     * @return �Ƿ�ɹ�ʩ�ż���
     */
    default boolean useSkill(String skillName){
        return getSkillManager().useSkill(skillName, this);
    }
}
