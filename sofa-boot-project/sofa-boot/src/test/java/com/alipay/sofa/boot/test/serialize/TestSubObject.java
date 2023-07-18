/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize;

import java.io.Serializable;

/**
 * TestSubobject
 *
 * @author xunfang
 * @version TestSubobject.java, v 0.1 2023/7/14
 */
public class TestSubObject implements Serializable {
    private Object value;

    public TestSubObject()
    {
    }

    public TestSubObject(Object value)
    {
        this.value = value;
    }

    public Object getValue()
    {
        return value;
    }

    public int hashCode()
    {
        if (value != null)
            return value.hashCode();
        else
            return 0;
    }

    public boolean equals(Object o)
    {
        if (!(o instanceof TestSubObject))
            return false;

        TestSubObject obj = (TestSubObject) o;

        if (value != null)
            return value.equals(obj.value);
        else
            return value == obj.value;
    }

    public String toString()
    {
        return getClass().getName() + "[" + value + "]";
    }
}
