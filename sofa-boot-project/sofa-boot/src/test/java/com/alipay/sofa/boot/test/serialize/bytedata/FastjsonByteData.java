/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize.bytedata;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.sofa.boot.test.serialize.TestObject;
import com.alipay.sofa.boot.test.serialize.TestSubObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * FastjsonByteData
 *
 * @author xunfang
 * @version FastjsonByteData.java, v 0.1 2023/7/17
 */
public class FastjsonByteData extends BaseData{
    private static final Map<String, byte[]> byteData = new HashMap<>();

    public static void main(String[] args) throws IOException {
        loadData();
        for (Map.Entry<String, Object> entry : metaData.entrySet()) {
            SerializeWriter out = new SerializeWriter();
            JSONSerializer serializer = new JSONSerializer(out);
            serializer.write(entry.getValue());
            byte[] data = out.toBytes("UTF-8");
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
        binary_0_Bytes = new byte[]{34, 34};
        binary_1_Bytes = new byte[]{34, 77, 65, 61, 61, 34};
        binary_15_Bytes = new byte[]{34, 77, 68, 69, 121, 77, 122, 81, 49, 78, 106, 99, 52, 79, 84, 65, 120, 77, 106, 77, 48, 34};
        binary_16_Bytes = new byte[]{34, 77, 68, 69, 121, 77, 122, 81, 49, 78, 106, 99, 52, 79, 84, 65, 120, 77, 106, 77, 48, 78, 81, 61, 61, 34};
        binary_null_Bytes = new byte[]{110, 117, 108, 108};
        date_0_Bytes = new byte[]{48};
        date_1_Bytes = new byte[]{56, 57, 52, 54, 50, 49, 48, 57, 49, 48, 48, 48};
        date_2_Bytes = new byte[]{56, 57, 52, 54, 50, 49, 48, 54, 48, 48, 48, 48};
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
        object_1_Bytes = new byte[]{123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 125};
        object_2_Bytes = new byte[]{123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 52, 46, 48, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 34, 69, 78, 85, 77, 95, 84, 89, 80, 69, 49, 34, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 51, 46, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 49, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 50, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 53, 46, 48, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 123, 34, 118, 97, 108, 117, 101, 34, 58, 34, 116, 101, 115, 116, 83, 117, 98, 79, 98, 106, 101, 99, 116, 34, 125, 125};
        object_3_Bytes = new byte[]{91, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 49, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 125, 44, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 50, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 125, 93};
        object_4_Bytes = new byte[]{91, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 46, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 125, 44, 123, 34, 36, 114, 101, 102, 34, 58, 34, 36, 91, 48, 93, 34, 125, 93};
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
        typedMap_2_Bytes = new byte[]{123, 49, 58, 34, 98, 34, 44, 48, 58, 34, 97, 34, 125};
        typedMap_3_Bytes = new byte[]{123, 91, 34, 97, 34, 93, 58, 48, 125};
        untypedFixedList_0_Bytes = new byte[]{91, 93};
        untypedFixedList_1_Bytes = new byte[]{91, 34, 49, 34, 93};
        untypedFixedList_7_Bytes = new byte[]{91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 93};
        untypedFixedList_8_Bytes = new byte[]{91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 44, 34, 56, 34, 93};
        untypedMap_0_Bytes = new byte[]{123, 125};
        untypedMap_1_Bytes = new byte[]{123, 34, 97, 34, 58, 48, 125};
        untypedMap_2_Bytes = new byte[]{123, 48, 58, 34, 97, 34, 44, 49, 58, 34, 98, 34, 125};
        untypedMap_3_Bytes = new byte[]{123, 91, 34, 97, 34, 93, 58, 48, 125};
    }

    @Test
    public void testFastJsonSerialize() throws Exception {
        doValidate();
    }

    @Override
    public void validate(byte[] bytes, Object obj, String type) throws Exception {
        if (type.equals("byte[]")) {
            return;
        } else if (type.equals("date")) {
            isEqual(obj, JSON.parseObject(new String(bytes), Date.class), type);
        } else if (type.equals("double")) {
            isEqual(obj, JSON.parseObject(new String(bytes), Double.class), type);
        } else if (type.equals("long")) {
            isEqual(obj, JSON.parseObject(new String(bytes), Long.class), type);
        } else if (obj instanceof List && type.equals("object")) {
            isEqual(obj, JSON.parseArray(new String(bytes), TestObject.class), type);
        } else if (type.equals("object")) {
            isEqual(obj, JSON.parseObject(new String(bytes), TestObject.class), type);
        } else if (type.equals("list") || type.equals("string[]") ) {
            isEqual(obj, JSON.parseArray(new String(bytes), String.class), type);
        } else if (type.equals("map")) {
            isEqual(obj, JSON.parseObject(new String(bytes), Map.class), type);
        } else {
            isEqual(obj, JSON.parse(bytes), type);
        }

    }

    @Override
    public void isEqual(Object obj1, Object obj2, String type) {
        if (obj1 == obj2) {return;}
        if ("object".equals(type)) {
            if (obj2 instanceof TestObject && ((TestObject) obj2).getSubObject() != null) {
                ((TestObject) obj2).setSubObject(new TestSubObject("testSubObject"));
            }
            Assert.assertEquals(obj1.toString(), obj2.toString());
        } else {
            super.isEqual(obj1, obj2, type);
        }
    }
}
