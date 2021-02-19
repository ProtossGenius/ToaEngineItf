package com.suremoon.game.door.units_itf.skill_about;

import com.suremoon.game.door.attribute.AttributeAdapter;
import com.suremoon.game.door.units_itf.UnitItf;

import java.util.HashMap;
import java.util.Map;
/**
 * ���ܹ�����
 */
public class SkillManager {
    private Map<String, SkillInfo> skillInfoMap = new HashMap<>();

    /** ʹ�ü���
     * �жϼ����Ƿ�����ͷţ��������ͷ������״̬��ʩ�ż���
     * @param skillName
     * @param unit
     * @return �Ƿ��ͷųɹ�
     */
    public boolean useSkill(String skillName, UnitItf unit){
        SkillInfo info = skillInfoMap.get(skillName);
        AttributeAdapter attr = unit.getAttribute();
        if(info == null)return false;
        if(System.currentTimeMillis() - info.lastTime < info.cd){
            return false;
        }
        if(attr.getMp() < info.cost){
            return false;
        }
        attr.setMp(attr.getMp() - info.cost);
        info.lastTime = System.currentTimeMillis();

        return true;
    }
    public SkillManager addSkillInfo(String skillName, int cd, int cost, SkillDo skillDo){
        skillInfoMap.put(skillName, new SkillInfo(cd, cost, skillDo));
        return this;
    }
    public SkillInfo getSkillInfo(String skillName){
        return skillInfoMap.get(skillName);
    }
    public Map<String, SkillInfo> getSkillInfoMap() {
        return skillInfoMap;
    }
}
