package com.suremoon.game.door.kernel;

import com.suremoon.game.door.netabout.AGMessage;

import java.awt.*;

public interface GameScreenItf {
    /**
     * @param focusPoint ��Ļ���㣨�����λ�ã�
     */
    void setFocusPoint(Point focusPoint);

    default void setFocusPoint(int x, int y) {
        setFocusPoint(new Point(x, y));
    }

    /**
     * �ƶ���Ļ
     */
    void screenMove();

    /**
     * ��ʾ��ͼ
     * @param gp ����
     */
    void showMap(Graphics gp);
    /**
     * @return
     * {�������}��
     * {�������ComboUnit},
     * {Ч������ }
     * }
     */
    AGMessage[][] getShowers();

    /**
     * @return ��Ļ����
     */
    Rectangle getScreenRect();

    /**
     * @param moveLength ��Ļ�ƶ��Ĳ���
     */
    void setMoveLength(int moveLength);

    /**
     * @return ��Ļ����
     */
    Point getFocusPoint();

    /**
     * @param lastPoint �������λ��
     */
    void setLastPoint(Point lastPoint);

    /**
     * �ƶ���Ļ��
     */
    void doCalc();

    /**
     * @param gm ������Map
     */
    void setGameMap(GameMapItf gm);
}
