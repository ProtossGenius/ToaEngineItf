package com.suremoon.game.door.kernel;

import com.suremoon.game.door.factorys.*;

public interface WorldItf extends Runnable, CommandFactory, EffectFactory, StateFactory, TerrainFactory, UnitFactory, BuffFactory {
    /**
     * @return 世界所有的GameMap
     */
    GameMapItf getGameMap();

    /**
     * @return 世界名
     */
    String worldName();

    /**
     * @return 索引
     */
    int getWorldIndex();

    int getPieceTime();

    Status getStatus();

    void setStatus(Status status);

    /**
     * 保存世界状态。
     */
    void save();

    /**
     *  推送GRect到计算队列中
     */
    void pushGRectToCalcQueue(GRectItf gRect);
}
