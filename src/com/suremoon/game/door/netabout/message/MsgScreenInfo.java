package com.suremoon.game.door.netabout.message;

import com.suremoon.game.door.netabout.AGMessage;
import com.suremoon.game.door.tools.ByteStream;
import com.suremoon.game.door.tools.CJDeal;

public class MsgScreenInfo implements AGMessage {
    private int WorldIndex;
    private AGMessage[][] info;

    public int getWorldIndex(){return WorldIndex;}
    public synchronized AGMessage[][] getShowInfo(){return info;}

    public MsgScreenInfo(){
        this.info = new AGMessage[3][];
        for(int i = 0; i < 3; ++i){
            info[i] = new AGMessage[0];
        }
    }
    public MsgScreenInfo(int worldIndex, AGMessage[][] res){
        this.WorldIndex = worldIndex;
        this.info = res;
    }

    public MsgScreenInfo(ByteStream bs){
        this.info = new AGMessage[3][];

        WorldIndex = bs.getInteger();
        info[0] = new AGMessage[]{new MsgUnit(bs)};
        var length = bs.getInteger();
        info[1] =new AGMessage[length];
        for (int i = 0; i < length; ++i){
            info[1][i] = new MsgUnit(bs);
        }

        length = bs.getInteger();
        info[2] = new AGMessage[length];
        for (int i = 0; i < length; ++i){
            info[2][i] = new MsgEffect(bs);
        }
    }

    @Override
    public byte[] toBytes() {
        var bytes = new byte[4 + info[1].length + info[2].length][];
        int index = 0;
        bytes[index++] = CJDeal.int2byte(WorldIndex);
        bytes[index++] = info[0][0].toBytes();
        bytes[index++] = CJDeal.int2byte(info[1].length);
        for(int i = 0; i < info[1].length; ++i){
            bytes[index++] = info[1][i].toBytes();
        }
        bytes[index++] = CJDeal.int2byte(info[2].length);
        for(int i = 0; i < info[2].length; ++i){
            bytes[index++] = info[2][i].toBytes();
        }
        return CJDeal.ByteArrayConnect(bytes);
    }
}
