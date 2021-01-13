package com.suremoon.game.door.kernel;

import com.suremoon.game.door.factorys.Factories;

public interface WorldItf extends Runnable{
    /**
     * @return �������е�GameMap
     */
    GameMapItf getGameMap();

    /**
     * @param worldMgr ���������
     * @param index ��������������е�����
     */
    void setWorldMgr(WorldMgrItf worldMgr, int index);

    /**
     * @return ������
     */
    String worldName();

    /**
     * @return ����
     */
    int getWorldIndex();

    Factories getFactories();
}
