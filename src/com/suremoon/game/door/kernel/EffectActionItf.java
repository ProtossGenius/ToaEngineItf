package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.EffectItf;

/**
 * Created by Water Moon on 2018/4/18.
 * ��ħ����Ч������
 */
public interface EffectActionItf {
    /**
     * @param effect ħ��Ч��
     * @param world ��������
     * @param wm    ���������
     */
    void effectDo(EffectItf effect, WorldItf world, WorldMgrItf wm);
    EffectActionItf Null = new NullEffectActionItf();
}

class NullEffectActionItf implements EffectActionItf {

    @Override
    public void effectDo(EffectItf effect, WorldItf world, WorldMgrItf wm) {
    }
}