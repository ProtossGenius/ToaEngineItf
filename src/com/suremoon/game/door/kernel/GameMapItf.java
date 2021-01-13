package com.suremoon.game.door.kernel;

import com.suremoon.game.door.infos.MapInformation;
import com.suremoon.game.door.kernel.manager.EffectMgrItf;
import com.suremoon.game.door.kernel.manager.UnitMgrItf;

/**
 *  ��Ϸ��ͼ�ӿ�
 */
public interface GameMapItf {

    /** ������ͼ��Ϣ�����������Ҫ���ڵ�ͼ�༭�����õ�
     * @param mapInfo
     */
    void changeMap(MapInformation mapInfo);

    /**
     * @param value
     * ��ͼ�����������е�ͼƬ�������ģ��ڴ洢��ʱ�������洢Ϊһ������
     * @return
     * ���洢�����ֱ���ɵ��ε�״̬��������ʾ��
     */
    static String getType(Integer value) {
        int first = value / 10, second = value % 10;
        return "" + first + second;
    }

    /**
     * ����
     */
    void doCalc();

    /**
     * @return ��ͼ������
     */
    int getCols();

    /**
     * @return ��ͼ������
     */
    int getRows();

    /**
     * @return ��ȡ��ײ�����
     */
    ImpactCheckerItf getImpactChecker();

    /**
     * @param ic ������ײ�����
     */
    void setImpactChecker(ImpactCheckerItf ic);

    /**
     * @return ��õ�ͼ�ڵ��ξ��εĿ��
     */
    int getTerrainWidth();

    /**
     * @return ��õ�ͼ�ڵ��ξ��εĸ߶�
     */
    int getTerrainHeight();

    /**
     * @return ��ͼ���ܿ��
     */
    int getMapWidth();

    /**
     * @return ��ͼ���ܸ߶�
     */
    int getMapHeight();

    /**
     * ��ȡ����
     * @param x ����������x�����ֵ
     * @param y ����������y�����ֵ
     * @return ����(x,y)λ�õĵ���
     */
    TerrainItf getTerrain(int x, int y);

    void setTerrain(int x, int y, TerrainItf terrain);

    GameScreenItf createGameScreen();
    UnitMgrItf getUnitMgr();
    void setUnitMgr(UnitMgrItf um);
    EffectMgrItf getEffectMgr();
    void setEffectMgr(EffectMgrItf em);
    /**
     * @param worldMgr �������������
     */
    void setWorldMgr(WorldMgrItf worldMgr);

    /**
     * @param world ���õ�ǰ��ͼ����������
     */
    void setWorld(WorldItf world);
    /**
     * @return ��ǰ��ͼ����������
     */
    WorldItf getWorld();

}

