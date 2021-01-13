package com.suremoon.game.door.nils;

import com.suremoon.game.door.kernel.*;

import java.awt.*;
import java.util.ArrayList;

/**
 * to avoid the problem null GRectMgr may caused.
 */
public class NullGRectMgr implements GRectMgrItf {
    @Override
    public ArrayList<GRectItf> getGRects(Rectangle screen) {
        return new ArrayList<>();
    }

    @Override
    public boolean GRectDo(Rectangle screen, GRectDoItf gRectDo) {
        return false;
    }

    @Override
    public boolean GRectDo(GRectDoItf gRectDo) {
        return false;
    }

    @Override
    public void update(GRectItf rect, Rectangle oldRect) {

    }

    @Override
    public void update(GRectItf rect, Point oldPos) {

    }

    @Override
    public void delGRect(GRectItf rect) {

    }

    @Override
    public void addGRect(GRectItf rect) {

    }

    @Override
    public ArrayList<GRectItf> getAllGRects() {
        return new ArrayList<>();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void doCalc(WorldItf world, WorldMgrItf worldMgr) {

    }
}