package com.singleFactory.enumSingle;

public enum  EnumSingle {

    INNERSINGLE;


    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingle getEnumSingle() {
        return INNERSINGLE;
    }
}
