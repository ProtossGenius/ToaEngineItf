package com.suremoon.game.door.gometry;

/**
 * TODO: ֮��ĳɶ��ж��ȼ�����ͨͼ�����磬½��/ˮ��/ɳ��/�ҽ����ߵȣ�
 */
public class Connectivity {
    /**
     * ��Ա�ǵ�ľ���
     */
    public int blockPos;
    public int branchFlag;
    /**
     * ��ͨ����
     */
    public boolean walkable;
    /**
     * ��ͨ����
     */
    public int No;
    public boolean canWalk(){
        return walkable;
    }

    public Connectivity(){}

    public Connectivity(int blockPos, int branchFlag, boolean walkable, int no) {
        this.blockPos = blockPos;
        this.branchFlag = branchFlag;
        this.walkable = walkable;
        No = no;
    }
}
