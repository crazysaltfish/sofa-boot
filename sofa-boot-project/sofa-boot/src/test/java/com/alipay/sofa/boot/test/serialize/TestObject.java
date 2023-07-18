/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize;

import java.io.Serializable;

/**
 * TestObject
 *
 * @author xunfang
 * @version TestObject.java, v 0.1 2023/7/13
 */
public class TestObject implements Serializable {
    private int intVar;

    private long longVar;

    private float floatVar;

    private double doubleVar;

    private String stringVar;

    private TestEnum enumVar;

    private TestSubObject subObject;

    public TestObject() {
    }

    public TestObject(int intVar) {
        this.intVar = intVar;
    }

    public int getIntVar() {
        return intVar;
    }

    public void setIntVar(int intVar) {
        this.intVar = intVar;
    }

    public long getLongVar() {
        return longVar;
    }

    public void setLongVar(long longVar) {
        this.longVar = longVar;
    }

    public float getFloatVar() {
        return floatVar;
    }

    public void setFloatVar(float floatVar) {
        this.floatVar = floatVar;
    }

    public double getDoubleVar() {
        return doubleVar;
    }

    public void setDoubleVar(double doubleVar) {
        this.doubleVar = doubleVar;
    }

    public String getStringVar() {
        return stringVar;
    }

    public void setStringVar(String stringVar) {
        this.stringVar = stringVar;
    }

    public TestEnum getEnumVar() {
        return enumVar;
    }

    public void setEnumVar(TestEnum enumVar) {
        this.enumVar = enumVar;
    }

    public void setSubObject(TestSubObject subObject) {
        this.subObject = subObject;
    }

    public TestSubObject getSubObject() {
        return subObject;
    }

    @Override
    public String toString() {
        return "TestObject{" +
                "intVar=" + intVar +
                ", longVar=" + longVar +
                ", floatVar=" + floatVar +
                ", doubleVar=" + doubleVar +
                ", stringVar='" + stringVar + '\'' +
                ", enumVar=" + enumVar +
                ", subObject=" + subObject +
                '}';
    }
}
