package com.suremoon.game.door.netabout.message;

import com.suremoon.game.door.netabout.AGMessage;
import com.suremoon.game.door.tools.ByteStream;
import com.suremoon.game.door.tools.CJDeal;

public class MsgString implements AGMessage {
    String str;
    public MsgString(String str){
        this.str = str;
    }
    public MsgString(ByteStream bs){
        byte[] bts = bs.getBytes(bs.getInteger());
        str = new String(bts) ;
    }

    public String getStr(){
        return str;
    }

    @Override
    public byte[] toBytes() {
        var bts = str.getBytes();
        return CJDeal.ByteArrayConnect(CJDeal.int2byte(bts.length), bts);
    }
}
