package com.suremoon.game.door.server;

import com.suremoon.game.door.kernel.WorldMgrItf;

public interface ServerItf {
    /**
     * �������Ӧ����������
     * @param port  �˿�
     * @param worldMgr ���������
     */
    void run(int port, WorldMgrItf worldMgr);
}
