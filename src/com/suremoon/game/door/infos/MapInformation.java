package com.suremoon.game.door.infos;

import com.suremoon.game.door.code_tools.Pair;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Water Moon on 2018/5/24.
 */
public class MapInformation {
    String version;
    int cols, rows, twidth, theight, adapterNums;
    ArrayList<Pair<Integer, String>> tConfs = new ArrayList<>();
    ArrayList<Pair<Integer, Integer>> adapters = new ArrayList<>();
    Pair<Integer, Integer> tmap[][];

    long terrainStart, tadapterStart;

    public MapInformation() {
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public ArrayList<Pair<Integer, String>> gettConfs() {
        return tConfs;
    }

    public void settConfs(ArrayList<Pair<Integer, String>> tConfs) {
        this.tConfs = tConfs;
    }

    public long getTerrainStart() {
        return terrainStart;
    }

    public void setTerrainStart(long terrainStart) {
        this.terrainStart = terrainStart;
    }

    public long getTadapterStart() {
        return tadapterStart;
    }

    public void setTadapterStart(long tadapterStart) {
        this.tadapterStart = tadapterStart;
    }

    public ArrayList<Pair<Integer, Integer>> getAdapters() {
        return adapters;
    }

    public void setAdapters(ArrayList<Pair<Integer, Integer>> adapters) {
        this.adapters = adapters;
    }

    public Pair<Integer, Integer>[][] getTmap() {
        return tmap;
    }

    public void setTmap(Pair<Integer, Integer>[][] tmap) {
        this.tmap = tmap;
    }

    public void setTerrain(int x, int y, Pair<Integer, Integer> terrain){
        if(x < 0 || y < 0 || x >= getCols() || y >= getRows()){
            return;
        }
        tmap[x][y] = terrain;
    }

    public int getAdapterNums() {
        return adapterNums;
    }

    public void setAdapterNums(int adapterNums) {
        this.adapterNums = adapterNums;
    }

    public int getTwidth() {
        return twidth;
    }

    public void setTwidth(int twidth) {
        this.twidth = twidth;
    }

    public int getTheight() {
        return theight;
    }

    public void setTheight(int theight) {
        this.theight = theight;
    }

    public Point getSize(){
        return new Point(twidth, theight);
    }

}
