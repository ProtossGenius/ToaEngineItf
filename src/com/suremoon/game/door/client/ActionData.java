package com.suremoon.game.door.client;

/**
 * Input Event ActionData.
 */
public class ActionData {
    public static final int DATA_TYPE_KEY_BOARD = 0, DATA_TYPE_MOUSE = 1, DATA_TYPE_ANOTHER = 2,
            VALUE_TYPE_PRESS = 0, VALUE_TYPE_REPLASE = 1;
    int dataType,//0:key, 1:Mouse, 2:�Զ���
            dataValue,//��keyֵ������ĸ����ȵ�
    /**
     * valueType
     * 0:����
     * 1:�ɿ�
     */
    valueType;//����갴�£����̧�𣬼��̰��µȵ��¼�������Ķ������в��䡣


    public ActionData() {
    }

    public ActionData(int dataType, int dataValue, int valueType) {
        this.dataType = dataType;
        this.dataValue = dataValue;
        this.valueType = valueType;
    }

    public int getValueType() {
        return valueType;
    }

    public void setValueType(int valueType) {
        this.valueType = valueType;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public int getDataValue() {
        return dataValue;
    }

    public void setDataValue(int dataValue) {
        this.dataValue = dataValue;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof ActionData) {
            return dataType == ((ActionData) obj).dataType && dataValue == ((ActionData) obj).dataValue && valueType == ((ActionData) obj).valueType;
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        String s_dataType = "";
        switch (dataType) {
            case 0:
                s_dataType = "����";
                break;
            case 1:
                s_dataType = "���";
                break;
            case 2:
                s_dataType = "�Զ���";
                break;
            default:
                s_dataType = "δ����";
        }
        return "����Ϊ" + s_dataType + ", ֵΪ��" + dataValue + "�� ״̬Ϊ�� " + valueType;
    }
}
