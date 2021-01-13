package com.suremoon.game.door.gometry;

import com.suremoon.game.door.kernel.GRectItf;
import com.suremoon.game.door.kernel.GRectMgrItf;
import com.suremoon.game.door.kernel.WorldItf;
import com.suremoon.game.door.kernel.WorldMgrItf;
import com.suremoon.game.door.nils.NullGRectMgr;

import java.awt.*;

/**
 * Created by Water Moon on 2018/1/10.
 */
public class GRect implements GRectItf {
    Dimension size;
    PointF pos;
//    ArrayList<GRInputListener> inputEvents = new ArrayList<>();
    GRectMgrItf manager = new NullGRectMgr();
    int walkLevel;
    protected PointF direct = new PointF(0, 0);

    protected PointF footPos = PointF.DIRECTION_ZERO;

    public GRect() {
        this(0, 0, 0, 0);
    }

    public GRect(int width, int height) {
        this(0, 0, width, height);
    }

    public GRect(int x, int y, int width, int height) {
        size = new Dimension(width, height);
        pos = new PointF(x, y);
    }

    public GRect(Rectangle rect) {
        this(rect.x, rect.y, rect.width, rect.height);
    }

    public GRect(Point pos, Point size) {
        this(pos.x, pos.y, size.x, size.y);
    }

    public GRect(PointF pos, Point size) {
        this(pos.getIntX(), pos.getIntY(), size.x, size.y);
    }

    @Override
    public Rectangle toRect() {
        return new Rectangle(pos.getIntX(), pos.getIntY(), size.width, size.height);
    }

    public boolean pointInGRect(Point p) {
        return p.x - pos.getX() >= 0 && p.x - pos.getX() <= size.width && p.y - pos.getY() >= 0 && p.y - pos.getY() <= size.height;
    }

    @Override
    public Dimension getSize() {
        return size;
    }

    @Override
    public void setSize(Point size) {
        this.size = new Dimension(size.x, size.y);
    }

    @Override
    public void setSize(int width, int height) {
        size.width = width;
        size.height = height;
    }

    @Override
    public void moveAdd(PointF cg) {
        if(cg.notLegitimacy()){
            return;
        }
        Point oldPos = pos.toPoint();
        this.pos.AddAs(cg);
        manager.update(this, oldPos);
    }

    @Override
    public PointF getPos() {
        return new PointF(pos);
    }

    @Override
    public void setPutPos(double x, double y) {
        setPos(x - footPos.getX() * getWidth(), y - footPos.getY() * getHeight());
    }

    @Override
    public void setPos(double x, double y) {
        if(Double.isNaN(x + y)){
            return;
        }
        Point oldPos = this.getPos().toPoint();
        pos.setPoint(x, y);
        manager.update(this, oldPos);
    }

    @Override
    public int getX() {
        return pos.getIntX();
    }

    @Override
    public int getY() {
        return pos.getIntY();
    }

    @Override
    public int getWidth() {
        return size.width;
    }

    @Override
    public int getHeight() {
        return size.height;
    }

    public boolean judgeNext() {
        return true;
    }

    @Override
    public PointF getFootPos() {
        return getPos().Add(new PointF(footPos.getX() * getWidth(), footPos.getY() * getHeight()));
    }

    @Override
    public void setFootPosPro(PointF footPos) {
        this.footPos = footPos;
    }

    public GRectMgrItf getGRectMgr() {
        return manager;
    }

    /**
     * manager will never be null.
     *
     * @param grm ¾ØÐÎ¹ÜÀíÆ÷
     */
    @Override
    public void setGRectMgr(GRectMgrItf grm) {
        if (grm == null) {
            return;
        }
        this.manager = grm;
    }

    @Override
    public String toString() {
        return super.toString() + "  Pos = " + pos.toString() + "Size = " + size.toString();
    }

    @Override
    public void doCalc(WorldItf world, WorldMgrItf wm) {

    }

    public PointF getDirect() {
        return direct;
    }

    public void setDirect(PointF direct) {
        if (direct.equals(PointF.DIRECTION_ZERO) || direct.notLegitimacy()) {
            return;
        }
        this.direct = direct;
    }
}
