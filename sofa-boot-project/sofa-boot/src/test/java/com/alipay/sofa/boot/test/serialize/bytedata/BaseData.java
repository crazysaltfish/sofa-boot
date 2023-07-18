/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize.bytedata;

import com.alipay.sofa.boot.test.serialize.SimpleDataGenerator;
import org.junit.Assert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * BaseData
 *
 * @author xunfang
 * @version BaseData.java, v 0.1 2023/7/18
 */
public class BaseData {
    protected static final SimpleDataGenerator dg = new SimpleDataGenerator();
    protected static final Map<String, Object> metaData = new HashMap<>();

    protected static byte[] binary_0_Bytes;
    protected static byte[] binary_1_Bytes;
    protected static byte[] binary_15_Bytes;
    protected static byte[] binary_16_Bytes;
    protected static byte[] binary_null_Bytes;
    protected static byte[] date_0_Bytes;
    protected static byte[] date_1_Bytes;
    protected static byte[] date_2_Bytes;
    protected static byte[] double_0_0_Bytes;
    protected static byte[] double_0_001_Bytes;
    protected static byte[] double_127_0_Bytes;
    protected static byte[] double_128_0_Bytes;
    protected static byte[] double_1_0_Bytes;
    protected static byte[] double_2_0_Bytes;
    protected static byte[] double_32767_0_Bytes;
    protected static byte[] double_3_14159_Bytes;
    protected static byte[] double_65_536_Bytes;
    protected static byte[] double_m0_001_Bytes;
    protected static byte[] double_m128_0_Bytes;
    protected static byte[] double_m129_0_Bytes;
    protected static byte[] double_m32768_0_Bytes;
    protected static byte[] false_Bytes;
    protected static byte[] int_0_Bytes;
    protected static byte[] int_0x30_Bytes;
    protected static byte[] int_0x3ffff_Bytes;
    protected static byte[] int_0x40000_Bytes;
    protected static byte[] int_0x7ff_Bytes;
    protected static byte[] int_0x7fffffff_Bytes;
    protected static byte[] int_0x800_Bytes;
    protected static byte[] int_1_Bytes;
    protected static byte[] int_47_Bytes;
    protected static byte[] int_m0x40000_Bytes;
    protected static byte[] int_m0x40001_Bytes;
    protected static byte[] int_m0x800_Bytes;
    protected static byte[] int_m0x80000000_Bytes;
    protected static byte[] int_m0x801_Bytes;
    protected static byte[] int_m16_Bytes;
    protected static byte[] int_m17_Bytes;
    protected static byte[] long_0_Bytes;
    protected static byte[] long_0x10_Bytes;
    protected static byte[] long_0x3ffff_Bytes;
    protected static byte[] long_0x40000_Bytes;
    protected static byte[] long_0x7ff_Bytes;
    protected static byte[] long_0x7fffffff_Bytes;
    protected static byte[] long_0x800_Bytes;
    protected static byte[] long_0x80000000_Bytes;
    protected static byte[] long_1_Bytes;
    protected static byte[] long_15_Bytes;
    protected static byte[] long_m0x40000_Bytes;
    protected static byte[] long_m0x40001_Bytes;
    protected static byte[] long_m0x800_Bytes;
    protected static byte[] long_m0x80000000_Bytes;
    protected static byte[] long_m0x80000001_Bytes;
    protected static byte[] long_m0x801_Bytes;
    protected static byte[] long_m8_Bytes;
    protected static byte[] long_m9_Bytes;
    protected static byte[] null_Bytes;
    protected static byte[] object_1_Bytes;
    protected static byte[] object_2_Bytes;
    protected static byte[] object_3_Bytes;
    protected static byte[] object_4_Bytes;
    protected static byte[] string_0_Bytes;
    protected static byte[] string_1_Bytes;
    protected static byte[] string_31_Bytes;
    protected static byte[] string_32_Bytes;
    protected static byte[] string_null_Bytes;
    protected static byte[] true_Bytes;
    protected static byte[] typedFixedList_0_Bytes;
    protected static byte[] typedFixedList_1_Bytes;
    protected static byte[] typedFixedList_7_Bytes;
    protected static byte[] typedFixedList_8_Bytes;
    protected static byte[] typedMap_0_Bytes;
    protected static byte[] typedMap_1_Bytes;
    protected static byte[] typedMap_2_Bytes;
    protected static byte[] typedMap_3_Bytes;
    protected static byte[] untypedFixedList_0_Bytes;
    protected static byte[] untypedFixedList_1_Bytes;
    protected static byte[] untypedFixedList_7_Bytes;
    protected static byte[] untypedFixedList_8_Bytes;
    protected static byte[] untypedMap_0_Bytes;
    protected static byte[] untypedMap_1_Bytes;
    protected static byte[] untypedMap_2_Bytes;
    protected static byte[] untypedMap_3_Bytes;

    public static void loadData() {
        // null
        metaData.put("null", dg.generateNull());

        // boolean
        metaData.put("true", dg.generateTrue());
        metaData.put("false", dg.generateFalse());

        // integers
        metaData.put("int_0", dg.generateInt_0());
        metaData.put("int_1", dg.generateInt_1());
        metaData.put("int_47", dg.generateInt_47());
        metaData.put("int_m16", dg.generateInt_m16());
        metaData.put("int_0x30", dg.generateInt_0x30());
        metaData.put("int_0x7ff", dg.generateInt_0x7ff());
        metaData.put("int_m17", dg.generateInt_m17());
        metaData.put("int_m0x800", dg.generateInt_m0x800());
        metaData.put("int_0x800", dg.generateInt_0x800());
        metaData.put("int_0x3ffff", dg.generateInt_0x3ffff());
        metaData.put("int_m0x801", dg.generateInt_m0x801());
        metaData.put("int_m0x40000", dg.generateInt_m0x40000());
        metaData.put("int_0x40000", dg.generateInt_0x40000());
        metaData.put("int_0x7fffffff", dg.generateInt_0x7fffffff());
        metaData.put("int_m0x40001", dg.generateInt_m0x40001());
        metaData.put("int_m0x80000000", dg.generateInt_m0x80000000());

        // longs
        metaData.put("long_0", dg.generateLong_0());
        metaData.put("long_1", dg.generateLong_1());
        metaData.put("long_15", dg.generateLong_15());
        metaData.put("long_m8", dg.generateLong_m8());
        metaData.put("long_0x10", dg.generateLong_0x10());
        metaData.put("long_0x7ff", dg.generateLong_0x7ff());
        metaData.put("long_m9", dg.generateLong_m9());
        metaData.put("long_m0x800", dg.generateLong_m0x800());
        metaData.put("long_0x800", dg.generateLong_0x800());
        metaData.put("long_0x3ffff", dg.generateLong_0x3ffff());
        metaData.put("long_m0x801", dg.generateLong_m0x801());
        metaData.put("long_m0x40000", dg.generateLong_m0x40000());
        metaData.put("long_0x40000", dg.generateLong_0x40000());
        metaData.put("long_0x7fffffff", dg.generateLong_0x7fffffff());
        metaData.put("long_m0x40001", dg.generateLong_m0x40001());
        metaData.put("long_m0x80000000", dg.generateLong_m0x80000000());
        metaData.put("long_0x80000000", dg.generateLong_0x80000000());
        metaData.put("long_m0x80000001", dg.generateLong_m0x80000001());

        // doubles
        metaData.put("double_0_0", dg.generateDouble_0_0());
        metaData.put("double_1_0", dg.generateDouble_1_0());
        metaData.put("double_2_0", dg.generateDouble_2_0());
        metaData.put("double_127_0", dg.generateDouble_127_0());
        metaData.put("double_m128_0", dg.generateDouble_m128_0());
        metaData.put("double_128_0", dg.generateDouble_128_0());
        metaData.put("double_m129_0", dg.generateDouble_m129_0());
        metaData.put("double_32767_0", dg.generateDouble_32767_0());
        metaData.put("double_m32768_0", dg.generateDouble_m32768_0());
        metaData.put("double_0_001", dg.generateDouble_0_001());
        metaData.put("double_m0_001", dg.generateDouble_m0_001());
        metaData.put("double_65_536", dg.generateDouble_65_536());
        metaData.put("double_3_14159", dg.generateDouble_3_14159());

        // date
        metaData.put("date_0", dg.generateDate_0());
        metaData.put("date_1", dg.generateDate_1());
        metaData.put("date_2", dg.generateDate_2());

        // strings
        metaData.put("string_0", dg.generateString_0());
        metaData.put("string_null", dg.generateString_null());
        metaData.put("string_1", dg.generateString_1());
        metaData.put("string_31", dg.generateString_31());
        metaData.put("string_32", dg.generateString_32());
//        metaData.put("string_1023", dg.generateString_1023());
//        metaData.put("string_1024", dg.generateString_1024());
//        metaData.put("string_65536", dg.generateString_65536());

        // binaries
        metaData.put("binary_0", dg.generateBinary_0());
        metaData.put("binary_null", dg.generateBinary_null());
        metaData.put("binary_1", dg.generateBinary_1());
        metaData.put("binary_15", dg.generateBinary_15());
        metaData.put("binary_16", dg.generateBinary_16());
//        metaData.put("binary_1023", dg.generateBinary_1023());
//        metaData.put("binary_1024", dg.generateBinary_1024());
//        metaData.put("binary_65536", dg.generateBinary_65536());

        // lists
        metaData.put("untypedFixedList_0", dg.generateUntypedFixedList_0());
        metaData.put("untypedFixedList_1", dg.generateUntypedFixedList_1());
        metaData.put("untypedFixedList_7", dg.generateUntypedFixedList_7());
        metaData.put("untypedFixedList_8", dg.generateUntypedFixedList_8());
        metaData.put("typedFixedList_0", dg.generateTypedFixedList_0());
        metaData.put("typedFixedList_1", dg.generateTypedFixedList_1());
        metaData.put("typedFixedList_7", dg.generateTypedFixedList_7());
        metaData.put("typedFixedList_8", dg.generateTypedFixedList_8());
        metaData.put("untypedMap_0", dg.generateUntypedMap_0());
        metaData.put("untypedMap_1", dg.generateUntypedMap_1());
        metaData.put("untypedMap_2", dg.generateUntypedMap_2());
        metaData.put("untypedMap_3", dg.generateUntypedMap_3());
        metaData.put("typedMap_0", dg.generateTypedMap_0());
        metaData.put("typedMap_1", dg.generateTypedMap_1());
        metaData.put("typedMap_2", dg.generateTypedMap_2());
        metaData.put("typedMap_3", dg.generateTypedMap_3());

        // objects
        metaData.put("object_1", dg.generateObject_1());
        metaData.put("object_2", dg.generateObject_2());
        metaData.put("object_3", dg.generateObject_3());
        metaData.put("object_4", dg.generateObject_4());
    }

    public static void isEqual(Object obj1, Object obj2, String type) {
        switch (type) {
            case "byte[]":
                Assert.assertArrayEquals((byte[]) obj1, (byte[]) obj2);
                break;
            case "object":
                Assert.assertEquals(obj1.toString(), obj2.toString());
                break;
            case "string[]":
                Assert.assertArrayEquals((String[]) obj1, (String[]) obj1);
                break;
            case "list":
                Assert.assertEquals(obj1.toString(), obj2.toString());
                break;
            case "map":
                Assert.assertEquals(obj1.toString(), obj2.toString());
                break;
            default:
                Assert.assertEquals(obj1, obj2);
        }
    }
}
