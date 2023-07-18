/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize;

/**
 * TestEnum
 *
 * @author xunfang
 * @version TestEnum.java, v 0.1 2023/7/13
 */
public enum TestEnum {
    ENUM_TYPE1("value1", "desc1"),

    ENUM_TYPE2("value2", "desc2");

    private String value;
    private String desc;

    TestEnum(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "TestEnum{" +
                "value='" + value + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
