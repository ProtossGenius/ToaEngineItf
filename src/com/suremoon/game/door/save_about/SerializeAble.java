package com.suremoon.game.door.save_about;

import com.suremoon.game.door.tools.ByteStream;

/**
 * �����л�����ͬ��AGMessage���������ȫ���л����ڴ���������ĳ�ʼ�������ࡣ
 */
public interface SerializeAble {
    void parseFromBytes(ByteStream byteStream);
    byte[] encodeToBytes();
}
