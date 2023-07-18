/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * SimpleDataGenerator
 *
 * @author xunfang
 * @version SimpleDataGenerator.java, v 0.1 2023/7/14
 */
public class SimpleDataGenerator {
    //
    // generate tests, testing serialization output
    //

    public Object generateNull() {
        return null;
    }

    //
    // boolean
    //

    public Object generateTrue() {
        return true;
    }

    public Object generateFalse() {
        return false;
    }

    //
    // integers
    //

    // single byte integers

    public int generateInt_0() {
        return 0;
    }

    public int generateInt_1() {
        return 1;
    }

    public int generateInt_47() {
        return 47;
    }

    public int generateInt_m16() {
        return -16;
    }

    // two byte integers

    public int generateInt_0x30() {
        return 0x30;
    }

    public int generateInt_0x7ff() {
        return 0x7ff;
    }

    public int generateInt_m17() {
        return -17;
    }

    public int generateInt_m0x800() {
        return -0x800;
    }

    // three byte integers

    public int generateInt_0x800() {
        return 0x800;
    }

    public int generateInt_0x3ffff() {
        return 0x3ffff;
    }

    public int generateInt_m0x801() {
        return -0x801;
    }

    public int generateInt_m0x40000() {
        return -0x40000;
    }

    // 5 byte integers

    public int generateInt_0x40000() {
        return 0x40000;
    }

    public int generateInt_0x7fffffff() {
        return 0x7fffffff;
    }

    public int generateInt_m0x40001() {
        return -0x40001;
    }

    public int generateInt_m0x80000000() {
        return -0x80000000;
    }

    //
    // longs
    //

    // single byte longs

    public long generateLong_0() {
        return 0;
    }

    public long generateLong_1() {
        return 1;
    }

    public long generateLong_15() {
        return 15;
    }

    public long generateLong_m8() {
        return -8;
    }

    // two byte longs

    public long generateLong_0x10() {
        return 0x10;
    }

    public long generateLong_0x7ff() {
        return 0x7ff;
    }

    public long generateLong_m9() {
        return -9;
    }

    public long generateLong_m0x800() {
        return -0x800;
    }

    // three byte longs

    public long generateLong_0x800() {
        return 0x800;
    }

    public long generateLong_0x3ffff() {
        return 0x3ffff;
    }

    public long generateLong_m0x801() {
        return -0x801;
    }

    public long generateLong_m0x40000() {
        return -0x40000;
    }

    // 5 byte longs

    public long generateLong_0x40000() {
        return 0x40000;
    }

    public long generateLong_0x7fffffff() {
        return 0x7fffffff;
    }

    public long generateLong_m0x40001() {
        return -0x40001;
    }

    public long generateLong_m0x80000000() {
        return -0x80000000;
    }

    public long generateLong_0x80000000() {
        return 0x80000000L;
    }

    public long generateLong_m0x80000001() {
        return -0x80000001L;
    }

    //
    // doubles
    //

    public double generateDouble_0_0() {
        return 0;
    }

    public double generateDouble_1_0() {
        return 1;
    }

    public double generateDouble_2_0() {
        return 2;
    }

    public double generateDouble_127_0() {
        return 127;
    }

    public double generateDouble_m128_0() {
        return -128;
    }

    public double generateDouble_128_0() {
        return 128;
    }

    public double generateDouble_m129_0() {
        return -129;
    }

    public double generateDouble_32767_0() {
        return 32767;
    }

    public double generateDouble_m32768_0() {
        return -32768;
    }

    public double generateDouble_0_001() {
        return 0.001;
    }

    public double generateDouble_m0_001() {
        return -0.001;
    }

    public double generateDouble_65_536() {
        return 65.536;
    }

    public double generateDouble_3_14159() {
        return 3.14159;
    }

    // date

    public Object generateDate_0() {
        return new Date(0);
    }

    public Object generateDate_1() {
        long time = 894621091000L;

        return new Date(time);
    }

    public Object generateDate_2() {
        long time = 894621091000L;

        time -= time % 60000L;

        return new Date(time);
    }

    // strings by length

    public String generateString_0() {
        return "";
    }

    public String generateString_null() {
        return null;
    }

    public String generateString_1() {
        return "0";
    }

    public String generateString_31() {
        return "0123456789012345678901234567890";
    }

    public String generateString_32() {
        return "01234567890123456789012345678901";
    }

    public String generateString_1023() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append("" + (i / 10) + (i % 10)
                    + " 456789012345678901234567890123456789012345678901234567890123\n");
        }

        sb.setLength(1023);

        return sb.toString();
    }

    public String generateString_1024() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append("" + (i / 10) + (i % 10)
                    + " 456789012345678901234567890123456789012345678901234567890123\n");
        }

        sb.setLength(1024);

        return sb.toString();
    }

    public String generateString_65536() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 64 * 16; i++) {
            sb.append("" + (i / 100) + (i / 10 % 10) + (i % 10)
                    + " 56789012345678901234567890123456789012345678901234567890123\n");
        }

        sb.setLength(65536);

        return sb.toString();
    }

    // binarys by length

    public Object generateBinary_0() {
        return new byte[0];
    }

    public Object generateBinary_null() {
        return null;
    }

    public Object generateBinary_1() {
        return toBinary("0");
    }

    public Object generateBinary_15() {
        return toBinary("012345678901234");
    }

    public Object generateBinary_16() {
        return toBinary("0123456789012345");
    }

    public Object generateBinary_1023() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append("" + (i / 10) + (i % 10)
                    + " 456789012345678901234567890123456789012345678901234567890123\n");
        }

        sb.setLength(1023);

        return toBinary(sb.toString());
    }

    public Object generateBinary_1024() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            sb.append("" + (i / 10) + (i % 10)
                    + " 456789012345678901234567890123456789012345678901234567890123\n");
        }

        sb.setLength(1024);

        return toBinary(sb.toString());
    }

    public Object generateBinary_65536() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 64 * 16; i++) {
            sb.append("" + (i / 100) + (i / 10 % 10) + (i % 10)
                    + " 56789012345678901234567890123456789012345678901234567890123\n");
        }

        sb.setLength(65536);

        return toBinary(sb.toString());
    }

    private byte[] toBinary(String s) {
        byte[] buffer = new byte[s.length()];

        for (int i = 0; i < s.length(); i++)
            buffer[i] = (byte) s.charAt(i);

        return buffer;
    }

    //
    // lists
    //

    public Object generateUntypedFixedList_0() {
        ArrayList list = new ArrayList();

        return list;
    }

    public Object generateUntypedFixedList_1() {
        ArrayList list = new ArrayList();

        list.add("1");

        return list;
    }

    public Object generateUntypedFixedList_7() {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        return list;
    }

    public Object generateUntypedFixedList_8() {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");

        return list;
    }

    public Object generateTypedFixedList_0() {
        return new String[] {};
    }

    public Object generateTypedFixedList_1() {
        return new String[] { "1" };
    }

    public Object generateTypedFixedList_7() {
        return new String[] { "1", "2", "3", "4", "5", "6", "7" };
    }

    public Object generateTypedFixedList_8() {
        return new String[] { "1", "2", "3", "4", "5", "6", "7", "8" };
    }

    // untyped map

    public Object generateUntypedMap_0() {
        return new HashMap();
    }

    public Object generateUntypedMap_1() {
        HashMap map = new HashMap();
        map.put("a", 0);

        return map;
    }

    public Object generateUntypedMap_2() {
        HashMap map = new HashMap();

        map.put(0, "a");
        map.put(1, "b");

        return map;
    }

    public Object generateUntypedMap_3() {
        HashMap map = new HashMap();

        ArrayList list = new ArrayList();
        list.add("a");

        map.put(list, 0);

        return map;
    }

    // typed map

    public Object generateTypedMap_0() {
        Hashtable map = new Hashtable();

        return map;
    }

    public Object generateTypedMap_1() {
        Map map = new Hashtable();

        map.put("a", 0);

        return map;
    }

    public Object generateTypedMap_2() {
        Map map = new Hashtable();

        map.put(0, "a");
        map.put(1, "b");

        return map;
    }

    public Object generateTypedMap_3() {
        Map map = new Hashtable();

        ArrayList list = new ArrayList();
        list.add("a");

        map.put(list, 0);

        return map;
    }

    //
    // objects
    //

    public Object generateObject_1() {
        return new TestObject();
    }

    public Object generateObject_2() {
        TestObject object = new TestObject();
        object.setIntVar(1);
        object.setLongVar(2);
        object.setFloatVar(3);
        object.setDoubleVar(4.0);
        object.setStringVar("5.0");
        object.setEnumVar(TestEnum.ENUM_TYPE1);
        object.setSubObject(new TestSubObject("testSubObject"));
        return object;
    }

    public Object generateObject_3() {
        ArrayList list = new ArrayList();

        list.add(new TestObject(1));
        list.add(new TestObject(2));

        return list;
    }

    public Object generateObject_4() {
        ArrayList list = new ArrayList();
        TestObject object = new TestObject();

        list.add(object);
        list.add(object);

        return list;
    }
}
