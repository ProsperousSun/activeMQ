package com.sun.KVET;

public enum AniamlEnum {
    CAT("catService","猫"),
    Dog("dogService","狗")
    ;
    private String code;
    private String desc;

    AniamlEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
