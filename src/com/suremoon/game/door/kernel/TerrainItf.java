package com.suremoon.game.door.kernel;

import com.suremoon.game.door.units_itf.UnitItf;

public interface TerrainItf extends AGTypeInf, GRectItf {
    /**
     * @param unit �����������ж��ĵ�λ
     * @return �Ƿ�����ڸõ�������
     */
    boolean walkAble(UnitItf unit);

    /**
     * @return ��ͼ��ʾ����
     */
    String getTerrainType();

    /**
     * @param terrainType ��ͼ��ʾ����
     */
    void setTerrainType(String terrainType);
}
