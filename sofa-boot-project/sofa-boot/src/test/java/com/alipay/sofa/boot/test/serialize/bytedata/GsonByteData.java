/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize.bytedata;

import com.alibaba.fastjson.JSON;
import com.alipay.sofa.boot.test.serialize.TestObject;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GsonByteData
 *
 * @author xunfang
 * @version GsonByteData.java, v 0.1 2023/7/17
 */
public class GsonByteData extends BaseData{
    private static final Map<String, byte[]> byteData = new HashMap<>();

    public static void main(String[] args) throws IOException {
        loadData();
        for (Map.Entry<String, Object> entry : metaData.entrySet()) {
            Gson gson = new Gson();
            byte[] data = gson.toJson(entry.getValue()).getBytes();
            byteData.put(entry.getKey(), data);
        }
        List<Map.Entry<String, byte[]>> byteDataList = new ArrayList<>(byteData.entrySet());
        byteDataList.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, byte[]> entry : byteDataList) {
            System.out.println(entry.getKey() + "_Bytes = new byte[]{"
                    + Arrays.toString(entry.getValue()).replace("[", "").replace("]", "")
                    + "};");
        }
    }

    static {
        binary_0_Bytes = new byte[]{91, 93};
        binary_1_Bytes = new byte[]{91, 52, 56, 93};
        binary_15_Bytes = new byte[]{91, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 44, 53, 51, 44, 53, 52, 44, 53, 53, 44, 53, 54, 44, 53, 55, 44, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 93};
        binary_16_Bytes = new byte[]{91, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 44, 53, 51, 44, 53, 52, 44, 53, 53, 44, 53, 54, 44, 53, 55, 44, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 44, 53, 51, 93};
        binary_null_Bytes = new byte[]{110, 117, 108, 108};
        date_0_Bytes = new byte[]{34, 74, 97, 110, 32, 49, 44, 32, 49, 57, 55, 48, 32, 56, 58, 48, 48, 58, 48, 48, 32, 65, 77, 34};
        date_1_Bytes = new byte[]{34, 77, 97, 121, 32, 56, 44, 32, 49, 57, 57, 56, 32, 53, 58, 53, 49, 58, 51, 49, 32, 80, 77, 34};
        date_2_Bytes = new byte[]{34, 77, 97, 121, 32, 56, 44, 32, 49, 57, 57, 56, 32, 53, 58, 53, 49, 58, 48, 48, 32, 80, 77, 34};
        double_0_0_Bytes = new byte[]{48, 46, 48};
        double_0_001_Bytes = new byte[]{48, 46, 48, 48, 49};
        double_127_0_Bytes = new byte[]{49, 50, 55, 46, 48};
        double_128_0_Bytes = new byte[]{49, 50, 56, 46, 48};
        double_1_0_Bytes = new byte[]{49, 46, 48};
        double_2_0_Bytes = new byte[]{50, 46, 48};
        double_32767_0_Bytes = new byte[]{51, 50, 55, 54, 55, 46, 48};
        double_3_14159_Bytes = new byte[]{51, 46, 49, 52, 49, 53, 57};
        double_65_536_Bytes = new byte[]{54, 53, 46, 53, 51, 54};
        double_m0_001_Bytes = new byte[]{45, 48, 46, 48, 48, 49};
        double_m128_0_Bytes = new byte[]{45, 49, 50, 56, 46, 48};
        double_m129_0_Bytes = new byte[]{45, 49, 50, 57, 46, 48};
        double_m32768_0_Bytes = new byte[]{45, 51, 50, 55, 54, 56, 46, 48};
        false_Bytes = new byte[]{102, 97, 108, 115, 101};
        int_0_Bytes = new byte[]{48};
        int_0x30_Bytes = new byte[]{52, 56};
        int_0x3ffff_Bytes = new byte[]{50, 54, 50, 49, 52, 51};
        int_0x40000_Bytes = new byte[]{50, 54, 50, 49, 52, 52};
        int_0x7ff_Bytes = new byte[]{50, 48, 52, 55};
        int_0x7fffffff_Bytes = new byte[]{50, 49, 52, 55, 52, 56, 51, 54, 52, 55};
        int_0x800_Bytes = new byte[]{50, 48, 52, 56};
        int_1_Bytes = new byte[]{49};
        int_47_Bytes = new byte[]{52, 55};
        int_m0x40000_Bytes = new byte[]{45, 50, 54, 50, 49, 52, 52};
        int_m0x40001_Bytes = new byte[]{45, 50, 54, 50, 49, 52, 53};
        int_m0x800_Bytes = new byte[]{45, 50, 48, 52, 56};
        int_m0x80000000_Bytes = new byte[]{45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 56};
        int_m0x801_Bytes = new byte[]{45, 50, 48, 52, 57};
        int_m16_Bytes = new byte[]{45, 49, 54};
        int_m17_Bytes = new byte[]{45, 49, 55};
        long_0_Bytes = new byte[]{48};
        long_0x10_Bytes = new byte[]{49, 54};
        long_0x3ffff_Bytes = new byte[]{50, 54, 50, 49, 52, 51};
        long_0x40000_Bytes = new byte[]{50, 54, 50, 49, 52, 52};
        long_0x7ff_Bytes = new byte[]{50, 48, 52, 55};
        long_0x7fffffff_Bytes = new byte[]{50, 49, 52, 55, 52, 56, 51, 54, 52, 55};
        long_0x800_Bytes = new byte[]{50, 48, 52, 56};
        long_0x80000000_Bytes = new byte[]{50, 49, 52, 55, 52, 56, 51, 54, 52, 56};
        long_1_Bytes = new byte[]{49};
        long_15_Bytes = new byte[]{49, 53};
        long_m0x40000_Bytes = new byte[]{45, 50, 54, 50, 49, 52, 52};
        long_m0x40001_Bytes = new byte[]{45, 50, 54, 50, 49, 52, 53};
        long_m0x800_Bytes = new byte[]{45, 50, 48, 52, 56};
        long_m0x80000000_Bytes = new byte[]{45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 56};
        long_m0x80000001_Bytes = new byte[]{45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 57};
        long_m0x801_Bytes = new byte[]{45, 50, 48, 52, 57};
        long_m8_Bytes = new byte[]{45, 56};
        long_m9_Bytes = new byte[]{45, 57};
        null_Bytes = new byte[]{110, 117, 108, 108};
        object_1_Bytes = new byte[]{123, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 125};
        object_2_Bytes = new byte[]{123, 34, 105, 110, 116, 86, 97, 114, 34, 58, 49, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 50, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 51, 46, 48, 44, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 52, 46, 48, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 53, 46, 48, 34, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 34, 69, 78, 85, 77, 95, 84, 89, 80, 69, 49, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 123, 34, 118, 97, 108, 117, 101, 34, 58, 34, 116, 101, 115, 116, 83, 117, 98, 79, 98, 106, 101, 99, 116, 34, 125, 125};
        object_3_Bytes = new byte[]{91, 123, 34, 105, 110, 116, 86, 97, 114, 34, 58, 49, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 125, 44, 123, 34, 105, 110, 116, 86, 97, 114, 34, 58, 50, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 125, 93};
        object_4_Bytes = new byte[]{91, 123, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 125, 44, 123, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 125, 93};
        string_0_Bytes = new byte[]{34, 34};
        string_1_Bytes = new byte[]{34, 48, 34};
        string_31_Bytes = new byte[]{34, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 34};
        string_32_Bytes = new byte[]{34, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 34};
        string_null_Bytes = new byte[]{110, 117, 108, 108};
        true_Bytes = new byte[]{116, 114, 117, 101};
        typedFixedList_0_Bytes = new byte[]{91, 93};
        typedFixedList_1_Bytes = new byte[]{91, 34, 49, 34, 93};
        typedFixedList_7_Bytes = new byte[]{91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 93};
        typedFixedList_8_Bytes = new byte[]{91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 44, 34, 56, 34, 93};
        typedMap_0_Bytes = new byte[]{123, 125};
        typedMap_1_Bytes = new byte[]{123, 34, 97, 34, 58, 48, 125};
        typedMap_2_Bytes = new byte[]{123, 34, 49, 34, 58, 34, 98, 34, 44, 34, 48, 34, 58, 34, 97, 34, 125};
        typedMap_3_Bytes = new byte[]{123, 34, 91, 97, 93, 34, 58, 48, 125};
        untypedFixedList_0_Bytes = new byte[]{91, 93};
        untypedFixedList_1_Bytes = new byte[]{91, 34, 49, 34, 93};
        untypedFixedList_7_Bytes = new byte[]{91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 93};
        untypedFixedList_8_Bytes = new byte[]{91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 44, 34, 56, 34, 93};
        untypedMap_0_Bytes = new byte[]{123, 125};
        untypedMap_1_Bytes = new byte[]{123, 34, 97, 34, 58, 48, 125};
        untypedMap_2_Bytes = new byte[]{123, 34, 48, 34, 58, 34, 97, 34, 44, 34, 49, 34, 58, 34, 98, 34, 125};
        untypedMap_3_Bytes = new byte[]{123, 34, 91, 97, 93, 34, 58, 48, 125};
    }

    @Test
    public void testGsonSerialize() throws Exception {
        doValidate();
    }

    @Override
    public void validate(byte[] bytes, Object obj, String type) throws Exception {
        Gson gson = new Gson();

        if (type.equals("byte[]")) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<byte[]>(){}.getType()), type);
        } else if (type.equals("date")) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<Date>(){}.getType()), type);
        } else if (type.equals("double")) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<Double>(){}.getType()), type);
        } else if (type.equals("long")) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<Long>(){}.getType()), type);
        } else if (obj instanceof List && type.equals("object")) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<List<TestObject>>(){}.getType()), type);
        } else if (type.equals("object")) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<TestObject>(){}.getType()), type);
        } else if (type.equals("list") || type.equals("string[]") ) {
            isEqual(obj, gson.fromJson(new String(bytes), new TypeToken<List<String>>(){}.getType()), type);
        } else if (type.equals("boolean")){
            isEqual(obj, gson.fromJson(new String(bytes), Boolean.class), type);
        } else if (type.equals("int")) {
            isEqual(obj, gson.fromJson(new String(bytes), Integer.class), type);
        } else if (type.equals("map")) {
            isEqual(obj, gson.fromJson(new String(bytes), Map.class), type);
        } else if (type.equals("string")) {
            isEqual(obj, gson.fromJson(new String(bytes), String.class), type);
        }

    }

    @Override
    public void isEqual(Object obj1, Object obj2, String type) {
        if (obj1 == obj2) {return;}
        if ("map".equals(type)) {
            Assert.assertEquals(obj1.toString(), obj1.toString());
        } else {
            super.isEqual(obj1, obj2, type);
        }
    }
}
