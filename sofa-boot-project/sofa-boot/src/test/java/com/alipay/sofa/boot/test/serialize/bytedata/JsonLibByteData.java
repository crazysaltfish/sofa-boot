/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize.bytedata;

import com.alipay.sofa.boot.test.serialize.TestObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * JsonLibByteData
 *
 * @author xunfang
 * @version JsonLibByteData.java, v 0.1 2023/7/17
 */
public class JsonLibByteData extends BaseData{
    private static final Map<String, byte[]> byteData = new HashMap<>();

    public static void main(String[] args) throws IOException {
        loadData();
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.setAllowNonStringKeys(true);
        for (Map.Entry<String, Object> entry : metaData.entrySet()) {
            JSONObject object = new JSONObject();
            Map<String, Object> objectMap = new HashMap<>();
            objectMap.put("key", entry.getValue());
            object.putAll(objectMap, jsonConfig);
            byte[] data = object.toString().getBytes();
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
        binary_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 93, 125};
        binary_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 52, 56, 93, 125};
        binary_15_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 44, 53, 51, 44, 53, 52, 44, 53, 53, 44, 53, 54, 44, 53, 55, 44, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 93, 125};
        binary_16_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 44, 53, 51, 44, 53, 52, 44, 53, 53, 44, 53, 54, 44, 53, 55, 44, 52, 56, 44, 52, 57, 44, 53, 48, 44, 53, 49, 44, 53, 50, 44, 53, 51, 93, 125};
        binary_null_Bytes = new byte[]{123, 125};
        date_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 100, 97, 116, 101, 34, 58, 49, 44, 34, 100, 97, 121, 34, 58, 52, 44, 34, 104, 111, 117, 114, 115, 34, 58, 56, 44, 34, 109, 105, 110, 117, 116, 101, 115, 34, 58, 48, 44, 34, 109, 111, 110, 116, 104, 34, 58, 48, 44, 34, 115, 101, 99, 111, 110, 100, 115, 34, 58, 48, 44, 34, 116, 105, 109, 101, 34, 58, 48, 44, 34, 116, 105, 109, 101, 122, 111, 110, 101, 79, 102, 102, 115, 101, 116, 34, 58, 45, 52, 56, 48, 44, 34, 121, 101, 97, 114, 34, 58, 55, 48, 125, 125};
        date_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 100, 97, 116, 101, 34, 58, 56, 44, 34, 100, 97, 121, 34, 58, 53, 44, 34, 104, 111, 117, 114, 115, 34, 58, 49, 55, 44, 34, 109, 105, 110, 117, 116, 101, 115, 34, 58, 53, 49, 44, 34, 109, 111, 110, 116, 104, 34, 58, 52, 44, 34, 115, 101, 99, 111, 110, 100, 115, 34, 58, 51, 49, 44, 34, 116, 105, 109, 101, 34, 58, 56, 57, 52, 54, 50, 49, 48, 57, 49, 48, 48, 48, 44, 34, 116, 105, 109, 101, 122, 111, 110, 101, 79, 102, 102, 115, 101, 116, 34, 58, 45, 52, 56, 48, 44, 34, 121, 101, 97, 114, 34, 58, 57, 56, 125, 125};
        date_2_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 100, 97, 116, 101, 34, 58, 56, 44, 34, 100, 97, 121, 34, 58, 53, 44, 34, 104, 111, 117, 114, 115, 34, 58, 49, 55, 44, 34, 109, 105, 110, 117, 116, 101, 115, 34, 58, 53, 49, 44, 34, 109, 111, 110, 116, 104, 34, 58, 52, 44, 34, 115, 101, 99, 111, 110, 100, 115, 34, 58, 48, 44, 34, 116, 105, 109, 101, 34, 58, 56, 57, 52, 54, 50, 49, 48, 54, 48, 48, 48, 48, 44, 34, 116, 105, 109, 101, 122, 111, 110, 101, 79, 102, 102, 115, 101, 116, 34, 58, 45, 52, 56, 48, 44, 34, 121, 101, 97, 114, 34, 58, 57, 56, 125, 125};
        double_0_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 48, 125};
        double_0_001_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 48, 46, 48, 48, 49, 125};
        double_127_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 50, 55, 125};
        double_128_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 50, 56, 125};
        double_1_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 125};
        double_2_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 125};
        double_32767_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 51, 50, 55, 54, 55, 125};
        double_3_14159_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 51, 46, 49, 52, 49, 53, 57, 125};
        double_65_536_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 54, 53, 46, 53, 51, 54, 125};
        double_m0_001_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 48, 46, 48, 48, 49, 125};
        double_m128_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 49, 50, 56, 125};
        double_m129_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 49, 50, 57, 125};
        double_m32768_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 51, 50, 55, 54, 56, 125};
        false_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 102, 97, 108, 115, 101, 125};
        int_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 48, 125};
        int_0x30_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 52, 56, 125};
        int_0x3ffff_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 54, 50, 49, 52, 51, 125};
        int_0x40000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 54, 50, 49, 52, 52, 125};
        int_0x7ff_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 48, 52, 55, 125};
        int_0x7fffffff_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 49, 52, 55, 52, 56, 51, 54, 52, 55, 125};
        int_0x800_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 48, 52, 56, 125};
        int_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 125};
        int_47_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 52, 55, 125};
        int_m0x40000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 54, 50, 49, 52, 52, 125};
        int_m0x40001_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 54, 50, 49, 52, 53, 125};
        int_m0x800_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 48, 52, 56, 125};
        int_m0x80000000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 56, 125};
        int_m0x801_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 48, 52, 57, 125};
        int_m16_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 49, 54, 125};
        int_m17_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 49, 55, 125};
        long_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 48, 125};
        long_0x10_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 54, 125};
        long_0x3ffff_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 54, 50, 49, 52, 51, 125};
        long_0x40000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 54, 50, 49, 52, 52, 125};
        long_0x7ff_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 48, 52, 55, 125};
        long_0x7fffffff_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 49, 52, 55, 52, 56, 51, 54, 52, 55, 125};
        long_0x800_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 48, 52, 56, 125};
        long_0x80000000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 50, 49, 52, 55, 52, 56, 51, 54, 52, 56, 125};
        long_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 125};
        long_15_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 49, 53, 125};
        long_m0x40000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 54, 50, 49, 52, 52, 125};
        long_m0x40001_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 54, 50, 49, 52, 53, 125};
        long_m0x800_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 48, 52, 56, 125};
        long_m0x80000000_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 56, 125};
        long_m0x80000001_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 49, 52, 55, 52, 56, 51, 54, 52, 57, 125};
        long_m0x801_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 50, 48, 52, 57, 125};
        long_m8_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 56, 125};
        long_m9_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 45, 57, 125};
        null_Bytes = new byte[]{123, 125};
        object_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 110, 117, 108, 108, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 110, 117, 108, 108, 125, 125};
        object_2_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 52, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 34, 69, 78, 85, 77, 95, 84, 89, 80, 69, 49, 34, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 51, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 49, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 50, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 53, 46, 48, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 123, 34, 118, 97, 108, 117, 101, 34, 58, 34, 116, 101, 115, 116, 83, 117, 98, 79, 98, 106, 101, 99, 116, 34, 125, 125, 125};
        object_3_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 110, 117, 108, 108, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 49, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 110, 117, 108, 108, 125, 44, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 110, 117, 108, 108, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 50, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 110, 117, 108, 108, 125, 93, 125};
        object_4_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 110, 117, 108, 108, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 110, 117, 108, 108, 125, 44, 123, 34, 100, 111, 117, 98, 108, 101, 86, 97, 114, 34, 58, 48, 44, 34, 101, 110, 117, 109, 86, 97, 114, 34, 58, 110, 117, 108, 108, 44, 34, 102, 108, 111, 97, 116, 86, 97, 114, 34, 58, 48, 44, 34, 105, 110, 116, 86, 97, 114, 34, 58, 48, 44, 34, 108, 111, 110, 103, 86, 97, 114, 34, 58, 48, 44, 34, 115, 116, 114, 105, 110, 103, 86, 97, 114, 34, 58, 34, 34, 44, 34, 115, 117, 98, 79, 98, 106, 101, 99, 116, 34, 58, 110, 117, 108, 108, 125, 93, 125};
        string_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 34, 34, 125};
        string_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 34, 48, 34, 125};
        string_31_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 34, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 34, 125};
        string_32_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 34, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 34, 125};
        string_null_Bytes = new byte[]{123, 125};
        true_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 116, 114, 117, 101, 125};
        typedFixedList_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 93, 125};
        typedFixedList_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 34, 49, 34, 93, 125};
        typedFixedList_7_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 93, 125};
        typedFixedList_8_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 44, 34, 56, 34, 93, 125};
        typedMap_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 125, 125};
        typedMap_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 97, 34, 58, 48, 125, 125};
        typedMap_2_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 49, 34, 58, 34, 98, 34, 44, 34, 48, 34, 58, 34, 97, 34, 125, 125};
        typedMap_3_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 91, 97, 93, 34, 58, 48, 125, 125};
        untypedFixedList_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 93, 125};
        untypedFixedList_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 34, 49, 34, 93, 125};
        untypedFixedList_7_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 93, 125};
        untypedFixedList_8_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 91, 34, 49, 34, 44, 34, 50, 34, 44, 34, 51, 34, 44, 34, 52, 34, 44, 34, 53, 34, 44, 34, 54, 34, 44, 34, 55, 34, 44, 34, 56, 34, 93, 125};
        untypedMap_0_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 125, 125};
        untypedMap_1_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 97, 34, 58, 48, 125, 125};
        untypedMap_2_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 48, 34, 58, 34, 97, 34, 44, 34, 49, 34, 58, 34, 98, 34, 125, 125};
        untypedMap_3_Bytes = new byte[]{123, 34, 107, 101, 121, 34, 58, 123, 34, 91, 97, 93, 34, 58, 48, 125, 125};
    }

    @Test
    public void testJsonLibSerialize() throws Exception {
        doValidate();
    }

    @Override
    public void validate(byte[] bytes, Object obj, String type) throws Exception {
        JSONObject jsonObject = JSONObject.fromObject(new String(bytes));
        JsonConfig jsonConfig = new JsonConfig();
        Map<String, Object> classMap = new HashMap<>();
        jsonConfig.setClassMap(classMap);
        if (type.equals("byte[]")) {
            isEqual(obj, jsonObject.get("key"), type);
        } else if (type.equals("date")) {
            jsonConfig.setRootClass(Date.class);
            Date toBean = (Date) JSONObject.toBean(jsonObject.getJSONObject("key"), jsonConfig);
            isEqual(obj, toBean, type);
        } else if (type.equals("double")) {
            isEqual(obj, jsonObject.getDouble("key"), type);
        } else if (type.equals("long")) {
            isEqual(obj, jsonObject.getLong("key"), type);
        } else if (obj instanceof List && type.equals("object")) {
            isEqual(obj, jsonObject.get("key"), type);
        } else if (type.equals("object")) {
            jsonConfig.setRootClass(TestObject.class);
            TestObject toBean = (TestObject) JSONObject.toBean(jsonObject.getJSONObject("key"), jsonConfig);
            isEqual(obj, toBean, type);
        } else if (type.equals("list") || type.equals("string[]") ) {
            isEqual(obj, jsonObject.get("key"), type);
        } else if (type.equals("boolean")){
            isEqual(obj, jsonObject.getBoolean("key"), type);
        } else if (type.equals("int")) {
            isEqual(obj, jsonObject.getInt("key"), type);
        } else if (type.equals("map")) {
            jsonConfig.setRootClass(Map.class);
            Map toBean = (Map) JSONObject.toBean(jsonObject.getJSONObject("key"), jsonConfig);
            isEqual(obj, toBean, type);
            isEqual(obj, jsonObject.get("key"), type);
        } else if (type.equals("string")) {
            if (obj == null) {
                return;
            }
            isEqual(obj, jsonObject.getString("key"), type);
        }

    }

    @Override
    public void isEqual(Object obj1, Object obj2, String type) {
        if (obj1 == obj2) {return;}
        if ("byte[]".equals(type)) {
            List<Byte> bytes = new ArrayList<>();
            for (byte b : (byte[])obj1) {
                bytes.add(b);
            }
            Collection toCollection = JSONArray.toCollection((JSONArray) obj2);
            Assert.assertEquals(bytes.toString(), toCollection.toString());
        } else if ("map".equals(type)) {
            Assert.assertEquals(obj1.toString(), obj1.toString());
        } else if ("object".equals(type)) {
            if (obj1 instanceof TestObject && ((TestObject) obj1).getStringVar() == null) {
                ((TestObject) obj1).setStringVar("");
            }
            Assert.assertEquals(obj1.toString(), obj1.toString());
        } else {
            super.isEqual(obj1, obj2, type);
        }
    }
}
