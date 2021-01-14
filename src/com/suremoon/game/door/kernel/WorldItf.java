package com.suremoon.game.door.kernel;

import com.suremoon.game.door.factorys.*;

public interface WorldItf extends Runnable, CommandFactory, EffectFactory, StateFactory, TerrainFactory, UnitFactory {
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

    Factories getFactories();

    int getPieceTime();
}
