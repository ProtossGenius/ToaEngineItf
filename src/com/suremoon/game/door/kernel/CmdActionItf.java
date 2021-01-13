package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.CommandItf;

/**
 * Created by Water Moon on 2018/4/18.
 * ��λ�������Ϊ
 */
public interface CmdActionItf {

    /**
     * @param cmd �������������λ
     * @param world ����
     * @param worldMgr �������
     * @return �Ƿ���ɣ��Ƿ�ɾ�������
     */
    boolean actionDo(CommandItf cmd, WorldItf world, WorldMgrItf worldMgr);
    CmdActionItf Null = new NullCmdActionItf();
}

class NullCmdActionItf implements CmdActionItf {
    @Override
    public boolean actionDo(CommandItf cmd, WorldItf world, WorldMgrItf worldMgr) {
        return true;
    }

}