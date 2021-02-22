package com.suremoon.game.door.kernel;

import com.suremoon.game.door.gometry.PointF;
import com.suremoon.game.door.kernel.manager.GRectMgrItf;
import com.suremoon.game.door.save_about.SerializeAble;

import java.awt.*;

public interface GRectItf extends CalcAble, SerializeAble {
    /**
     * @return ת����awt��Rect
     */
    Rectangle toRect();

    /**
     * @return ���GRect�Ĵ�С
     */
    Dimension getSize();

    /**
     * @param size GRect�Ĵ�С
     */
    void setSize(Point size);

    default void setSize(Dimension size) {
        setSize(size.width, size.height);
    }

    void setSize(int width, int height) ;
    /**ͨ������ֵ�ķ�ʽʹ֮�ƶ�,ͬʱ�����ڹ������е�λ��
     * @param cg �ƶ�����
     */
    void moveAdd(PointF cg);

    /**
     * @return ���Ͻǵ�λ��
     */
    PointF getPos();


    /**�������λ��
     * @param x ������
     * @param y ������
     */
    void setPutPos(double x, double y);

    /** �������λ��
     * @param pos λ��
     */
    default void setPutPos(Point pos) {
        setPutPos(pos.x, pos.y);
    }

    default void setPutPos(PointF pos) {
        setPutPos(pos.X, pos.Y);
    }

    /** �������Ͻ�λ�ã��Ҹ�������manager�е�λ��
     * @param x ������
     * @param y ������
     */
    void setPos(double x, double y);

    default void setPos(Point pos) {
        setPos(pos.x, pos.y);
    }

    default void setPos(PointF pos) {
        setPos(pos.X, pos.Y);
    }

    /**
     * ������λ��
     */
    void setPosWithoutUpdateManager(double x, double y);
    default void setPosWithoutUpdateManager(Point pos){
        setPosWithoutUpdateManager(pos.x, pos.y);}
    default void setPosWithoutUpdateManager(PointF pos) {
        setPosWithoutUpdateManager(pos.X, pos.Y);
    }

    /**
     * @return ��ú�����
     */
    int getX();

    /**
     * @return ���������
     */
    int getY();

    int getWidth();

    int getHeight();

    /**
     * @return ��ý����ڵ�����
     */
    PointF getFootPos();

    /**
     * @param footPos ���ھ����е����λ��
     */
    void setFootPosPro(PointF footPos);

    /**
     * @return ���ھ����е����λ��
     */
    PointF getFootPosPro();

    /**
     * @param grm �������ڵĹ�����
     */
    void setGRectMgr(GRectMgrItf grm);

    void setDirect(PointF direct);
    PointF getDirect();


    /**�����ĵ�λ�ᱻ�Ӽ�����м��������ж���
     * @param isDrop �Ƿ�Ҫ�����õ�λ
     */
    void setDrop(boolean isDrop);

    /**
     * @return �Ƿ�Ҫ�����õ�λ
     */
    boolean isDrop();

}
