package com.suremoon.game.door.kernel.manager;

import com.suremoon.game.door.kernel.GRectDoItf;
import com.suremoon.game.door.kernel.GRectItf;
import com.suremoon.game.door.nils.NullGRectMgr;

import java.awt.*;
import java.util.List;

public interface GRectMgrItf {
    GRectMgrItf Null = new NullGRectMgr();
    List<GRectItf> getGRects(Rectangle screen);
    boolean GRectDo(Rectangle screen, GRectDoItf gRectDo);
    // range all GRect.
    boolean GRectDo(GRectDoItf gRectDo);
    void update(GRectItf rect, Rectangle oldRect);

    void update(GRectItf rect, Point oldPos);

    void delGRect(GRectItf rect);

    void addGRect(GRectItf rect);

    List<GRectItf> getAllGRects();

    int size();
}