package com.singleFactory.enumSingle;

public enum  EnumSingle {

    INNERSINGLE;

    EnumSingle() {
    }

    public static EnumSingle getEnumSingle() {
        return INNERSINGLE;
    }
}
