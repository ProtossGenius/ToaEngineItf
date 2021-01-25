package com.suremoon.game.door.kernel;

import com.suremoon.game.door.factorys.*;

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
}
