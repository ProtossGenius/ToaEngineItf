package com.suremoon.game.door.kernel;

public interface WorldMgrItf extends Runnable{
    enum Status{
        Ready,
        Running,
        Paused,
        Stop,
    }
    Status getStatus();
    WorldItf getWorld(String path);
    WorldItf getWorld(int index);
}
