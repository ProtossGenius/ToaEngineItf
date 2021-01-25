package com.suremoon.game.door.units_itf;

import com.suremoon.game.door.kernel.CalcAble;
import com.suremoon.game.door.nils.NullBuff;

public interface BuffItf extends CalcAble {

    /**
     * ����Buff��ӵ����
     * @param u Unit
     * @return ����
     */
    BuffItf setOwner(UnitItf u);

    /**
     * @return ���buff�Ƿ�������Ч�����ʧЧ�Ļ����Ƴ���Buff��
     */
    boolean isAlive();
    BuffItf Null = new NullBuff();
}
