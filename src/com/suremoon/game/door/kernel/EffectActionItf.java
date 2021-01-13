package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.EffectItf;

/**
 * Created by Water Moon on 2018/4/18.
 * （魔法）效果动作
 */
public interface EffectActionItf {
    /**
     * @param effect 魔法效果
     * @param world 所属世界
     * @param wm    世界管理器
     */
    void effectDo(EffectItf effect, WorldItf world, WorldMgrItf wm);
    EffectActionItf Null = new NullEffectActionItf();
}

class NullEffectActionItf implements EffectActionItf {

    @Override
    public void effectDo(EffectItf effect, WorldItf world, WorldMgrItf wm) {
    }
}