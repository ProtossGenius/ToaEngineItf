package com.suremoon.game.door.kernel;

public interface WorldMgrItf extends Runnable{
    Status getStatus();
    WorldItf getWorld(String path);
    WorldItf getWorld(int index);
}
