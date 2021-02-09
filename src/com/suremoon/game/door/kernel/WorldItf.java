package com.suremoon.game.door.kernel;

import com.suremoon.game.door.factorys.*;
import com.suremoon.game.door.units_itf.EffectItf;
import com.suremoon.game.door.units_itf.UnitItf;

public interface WorldItf extends Runnable, CommandFactory, EffectFactory, StateFactory, TerrainFactory, UnitFactory, BuffFactory {
    /**
     * @return �������е�GameMap
     */
    GameMapItf getGameMap();

    /**
     * @return ������
     */
    String worldName();

    /**
     * @return ����
     */
    int getWorldIndex();

    int getPieceTime();

    Status getStatus();

    void setStatus(Status status);

    /**
     * ��������״̬��
     */
    void save();

    /**
     *  ����GRect�����������
     */
    void pushGRectToCalcQueue(GRectItf gRect);

    default void addUnit(UnitItf unit){this.getGameMap().getUnitMgr().addUnit(unit);}
    default void addEffect(EffectItf effect){this.getGameMap().getEffectMgr().addEffect(effect);}
}
