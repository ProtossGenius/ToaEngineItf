package com.suremoon.game.door.client;

/**
 * StateAction Ŀǰ��Ҫ���ڼ��ܵ�ָʾ������ĳЩ����������³�������ָʾ����
 * �����������������Ĳ��֡�
 */
public class StateAction {
    public static final int NOTHING = 0, POINTER = 1;
    public static final int POINTER_LINE = 11, POINTER_CIRCLE = 12, POINTER_AREA = 13;
    public int width;
    public int sa_type = NOTHING, sa_showType;
}
