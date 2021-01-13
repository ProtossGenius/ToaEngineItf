package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.CommandItf;

/**
 * Created by Water Moon on 2018/4/18.
 * 单位命令的行为
 */
public interface CmdActionItf {

    /**
     * @param cmd 命令，包含所属单位
     * @param world 世界
     * @param worldMgr 世界管理
     * @return 是否完成（是否删除该命令）
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