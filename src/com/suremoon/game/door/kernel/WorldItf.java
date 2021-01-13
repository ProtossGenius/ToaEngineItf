package com.suremoon.game.door.kernel;

import com.suremoon.game.door.factorys.Factories;

public interface WorldItf extends Runnable{
    /**
     * @return 世界所有的GameMap
     */
    GameMapItf getGameMap();

    /**
     * @param worldMgr 世界管理器
     * @param index 其在世界管理器中的索引
     */
    void setWorldMgr(WorldMgrItf worldMgr, int index);

    /**
     * @return 世界名
     */
    String worldName();

    /**
     * @return 索引
     */
    int getWorldIndex();

    Factories getFactories();
}
