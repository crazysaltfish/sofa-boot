/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize.bytedata;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * HessianByteData
 *
 * @author xunfang
 * @version HessianByteData.java, v 0.1 2023/7/17
 */
public class HessianByteData extends BaseData{
    private static final Map<String, byte[]> byteData = new HashMap<>();

    public static void main(String[] args) throws IOException {
        loadData();
        for (Map.Entry<String, Object> entry : metaData.entrySet()) {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Hessian2Output output = new Hessian2Output(os);
            output.writeObject(entry.getValue());
            output.close();
            byte[] data = os.toByteArray();
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
        binary_0_Bytes = new byte[]{32};
        binary_1_Bytes = new byte[]{33, 48};
        binary_15_Bytes = new byte[]{47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52};
        binary_16_Bytes = new byte[]{66, 0, 16, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53};
        binary_null_Bytes = new byte[]{78};
        date_0_Bytes = new byte[]{100, 0, 0, 0, 0, 0, 0, 0, 0};
        date_1_Bytes = new byte[]{100, 0, 0, 0, -48, 75, -110, -124, -72};
        date_2_Bytes = new byte[]{100, 0, 0, 0, -48, 75, -110, 11, -96};
        double_0_0_Bytes = new byte[]{103};
        double_0_001_Bytes = new byte[]{68, 63, 80, 98, 77, -46, -15, -87, -4};
        double_127_0_Bytes = new byte[]{105, 127};
        double_128_0_Bytes = new byte[]{106, 0, -128};
        double_1_0_Bytes = new byte[]{104};
        double_2_0_Bytes = new byte[]{105, 2};
        double_32767_0_Bytes = new byte[]{106, 127, -1};
        double_3_14159_Bytes = new byte[]{68, 64, 9, 33, -7, -16, 27, -122, 110};
        double_65_536_Bytes = new byte[]{68, 64, 80, 98, 77, -46, -15, -87, -4};
        double_m0_001_Bytes = new byte[]{68, -65, 80, 98, 77, -46, -15, -87, -4};
        double_m128_0_Bytes = new byte[]{105, -128};
        double_m129_0_Bytes = new byte[]{106, -1, 127};
        double_m32768_0_Bytes = new byte[]{106, -128, 0};
        false_Bytes = new byte[]{70};
        int_0_Bytes = new byte[]{-112};
        int_0x30_Bytes = new byte[]{-56, 48};
        int_0x3ffff_Bytes = new byte[]{-41, -1, -1};
        int_0x40000_Bytes = new byte[]{73, 0, 4, 0, 0};
        int_0x7ff_Bytes = new byte[]{-49, -1};
        int_0x7fffffff_Bytes = new byte[]{73, 127, -1, -1, -1};
        int_0x800_Bytes = new byte[]{-44, 8, 0};
        int_1_Bytes = new byte[]{-111};
        int_47_Bytes = new byte[]{-65};
        int_m0x40000_Bytes = new byte[]{-48, 0, 0};
        int_m0x40001_Bytes = new byte[]{73, -1, -5, -1, -1};
        int_m0x800_Bytes = new byte[]{-64, 0};
        int_m0x80000000_Bytes = new byte[]{73, -128, 0, 0, 0};
        int_m0x801_Bytes = new byte[]{-45, -9, -1};
        int_m16_Bytes = new byte[]{-128};
        int_m17_Bytes = new byte[]{-57, -17};
        long_0_Bytes = new byte[]{-32};
        long_0x10_Bytes = new byte[]{-8, 16};
        long_0x3ffff_Bytes = new byte[]{63, -1, -1};
        long_0x40000_Bytes = new byte[]{119, 0, 4, 0, 0};
        long_0x7ff_Bytes = new byte[]{-1, -1};
        long_0x7fffffff_Bytes = new byte[]{119, 127, -1, -1, -1};
        long_0x800_Bytes = new byte[]{60, 8, 0};
        long_0x80000000_Bytes = new byte[]{76, 0, 0, 0, 0, -128, 0, 0, 0};
        long_1_Bytes = new byte[]{-31};
        long_15_Bytes = new byte[]{-17};
        long_m0x40000_Bytes = new byte[]{56, 0, 0};
        long_m0x40001_Bytes = new byte[]{119, -1, -5, -1, -1};
        long_m0x800_Bytes = new byte[]{-16, 0};
        long_m0x80000000_Bytes = new byte[]{119, -128, 0, 0, 0};
        long_m0x80000001_Bytes = new byte[]{76, -1, -1, -1, -1, 127, -1, -1, -1};
        long_m0x801_Bytes = new byte[]{59, -9, -1};
        long_m8_Bytes = new byte[]{-40};
        long_m9_Bytes = new byte[]{-9, -9};
        null_Bytes = new byte[]{78};
        object_1_Bytes = new byte[]{79, -66, 99, 111, 109, 46, 97, 108, 105, 112, 97, 121, 46, 115, 111, 102, 97, 46, 98, 111, 111, 116, 46, 116, 101, 115, 116, 46, 115, 101, 114, 105, 97, 108, 105, 122, 101, 46, 84, 101, 115, 116, 79, 98, 106, 101, 99, 116, -105, 6, 105, 110, 116, 86, 97, 114, 7, 108, 111, 110, 103, 86, 97, 114, 8, 102, 108, 111, 97, 116, 86, 97, 114, 9, 100, 111, 117, 98, 108, 101, 86, 97, 114, 9, 115, 116, 114, 105, 110, 103, 86, 97, 114, 7, 101, 110, 117, 109, 86, 97, 114, 9, 115, 117, 98, 79, 98, 106, 101, 99, 116, 111, -112, -112, -32, 103, 103, 78, 78, 78};
        object_2_Bytes = new byte[]{79, -66, 99, 111, 109, 46, 97, 108, 105, 112, 97, 121, 46, 115, 111, 102, 97, 46, 98, 111, 111, 116, 46, 116, 101, 115, 116, 46, 115, 101, 114, 105, 97, 108, 105, 122, 101, 46, 84, 101, 115, 116, 79, 98, 106, 101, 99, 116, -105, 6, 105, 110, 116, 86, 97, 114, 7, 108, 111, 110, 103, 86, 97, 114, 8, 102, 108, 111, 97, 116, 86, 97, 114, 9, 100, 111, 117, 98, 108, 101, 86, 97, 114, 9, 115, 116, 114, 105, 110, 103, 86, 97, 114, 7, 101, 110, 117, 109, 86, 97, 114, 9, 115, 117, 98, 79, 98, 106, 101, 99, 116, 111, -112, -111, -30, 105, 3, 105, 4, 3, 53, 46, 48, 79, -68, 99, 111, 109, 46, 97, 108, 105, 112, 97, 121, 46, 115, 111, 102, 97, 46, 98, 111, 111, 116, 46, 116, 101, 115, 116, 46, 115, 101, 114, 105, 97, 108, 105, 122, 101, 46, 84, 101, 115, 116, 69, 110, 117, 109, -111, 4, 110, 97, 109, 101, 111, -111, 10, 69, 78, 85, 77, 95, 84, 89, 80, 69, 49, 79, -56, 49, 99, 111, 109, 46, 97, 108, 105, 112, 97, 121, 46, 115, 111, 102, 97, 46, 98, 111, 111, 116, 46, 116, 101, 115, 116, 46, 115, 101, 114, 105, 97, 108, 105, 122, 101, 46, 84, 101, 115, 116, 83, 117, 98, 79, 98, 106, 101, 99, 116, -111, 5, 118, 97, 108, 117, 101, 111, -110, 13, 116, 101, 115, 116, 83, 117, 98, 79, 98, 106, 101, 99, 116};
        object_3_Bytes = new byte[]{86, 110, 2, 79, -66, 99, 111, 109, 46, 97, 108, 105, 112, 97, 121, 46, 115, 111, 102, 97, 46, 98, 111, 111, 116, 46, 116, 101, 115, 116, 46, 115, 101, 114, 105, 97, 108, 105, 122, 101, 46, 84, 101, 115, 116, 79, 98, 106, 101, 99, 116, -105, 6, 105, 110, 116, 86, 97, 114, 7, 108, 111, 110, 103, 86, 97, 114, 8, 102, 108, 111, 97, 116, 86, 97, 114, 9, 100, 111, 117, 98, 108, 101, 86, 97, 114, 9, 115, 116, 114, 105, 110, 103, 86, 97, 114, 7, 101, 110, 117, 109, 86, 97, 114, 9, 115, 117, 98, 79, 98, 106, 101, 99, 116, 111, -112, -111, -32, 103, 103, 78, 78, 78, 111, -112, -110, -32, 103, 103, 78, 78, 78, 122};
        object_4_Bytes = new byte[]{86, 110, 2, 79, -66, 99, 111, 109, 46, 97, 108, 105, 112, 97, 121, 46, 115, 111, 102, 97, 46, 98, 111, 111, 116, 46, 116, 101, 115, 116, 46, 115, 101, 114, 105, 97, 108, 105, 122, 101, 46, 84, 101, 115, 116, 79, 98, 106, 101, 99, 116, -105, 6, 105, 110, 116, 86, 97, 114, 7, 108, 111, 110, 103, 86, 97, 114, 8, 102, 108, 111, 97, 116, 86, 97, 114, 9, 100, 111, 117, 98, 108, 101, 86, 97, 114, 9, 115, 116, 114, 105, 110, 103, 86, 97, 114, 7, 101, 110, 117, 109, 86, 97, 114, 9, 115, 117, 98, 79, 98, 106, 101, 99, 116, 111, -112, -112, -32, 103, 103, 78, 78, 78, 74, 1, 122};
        string_0_Bytes = new byte[]{0};
        string_1_Bytes = new byte[]{1, 48};
        string_31_Bytes = new byte[]{31, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48};
        string_32_Bytes = new byte[]{83, 0, 32, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 49};
        string_null_Bytes = new byte[]{78};
        true_Bytes = new byte[]{84};
        typedFixedList_0_Bytes = new byte[]{86, 116, 0, 7, 91, 115, 116, 114, 105, 110, 103, 110, 0, 122};
        typedFixedList_1_Bytes = new byte[]{86, 116, 0, 7, 91, 115, 116, 114, 105, 110, 103, 110, 1, 1, 49, 122};
        typedFixedList_7_Bytes = new byte[]{86, 116, 0, 7, 91, 115, 116, 114, 105, 110, 103, 110, 7, 1, 49, 1, 50, 1, 51, 1, 52, 1, 53, 1, 54, 1, 55, 122};
        typedFixedList_8_Bytes = new byte[]{86, 116, 0, 7, 91, 115, 116, 114, 105, 110, 103, 110, 8, 1, 49, 1, 50, 1, 51, 1, 52, 1, 53, 1, 54, 1, 55, 1, 56, 122};
        typedMap_0_Bytes = new byte[]{77, 116, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 72, 97, 115, 104, 116, 97, 98, 108, 101, 122};
        typedMap_1_Bytes = new byte[]{77, 116, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 72, 97, 115, 104, 116, 97, 98, 108, 101, 1, 97, -112, 122};
        typedMap_2_Bytes = new byte[]{77, 116, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 72, 97, 115, 104, 116, 97, 98, 108, 101, -111, 1, 98, -112, 1, 97, 122};
        typedMap_3_Bytes = new byte[]{77, 116, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 72, 97, 115, 104, 116, 97, 98, 108, 101, 86, 110, 1, 1, 97, 122, -112, 122};
        untypedFixedList_0_Bytes = new byte[]{86, 110, 0, 122};
        untypedFixedList_1_Bytes = new byte[]{86, 110, 1, 1, 49, 122};
        untypedFixedList_7_Bytes = new byte[]{86, 110, 7, 1, 49, 1, 50, 1, 51, 1, 52, 1, 53, 1, 54, 1, 55, 122};
        untypedFixedList_8_Bytes = new byte[]{86, 110, 8, 1, 49, 1, 50, 1, 51, 1, 52, 1, 53, 1, 54, 1, 55, 1, 56, 122};
        untypedMap_0_Bytes = new byte[]{77, 122};
        untypedMap_1_Bytes = new byte[]{77, 1, 97, -112, 122};
        untypedMap_2_Bytes = new byte[]{77, -112, 1, 97, -111, 1, 98, 122};
        untypedMap_3_Bytes = new byte[]{77, 86, 110, 1, 1, 97, 122, -112, 122};
    }

    @Test
    public void testHessianSerialize() throws Exception {
        validate(binary_0_Bytes, dg.generateBinary_0(), "byte[]");
        validate(binary_1_Bytes, dg.generateBinary_1(), "byte[]");
        validate(binary_15_Bytes, dg.generateBinary_15(), "byte[]");
        validate(binary_16_Bytes, dg.generateBinary_16(), "byte[]");
        validate(binary_null_Bytes, dg.generateBinary_null(), "byte[]");
        validate(date_0_Bytes, dg.generateDate_0(), null);
        validate(date_1_Bytes, dg.generateDate_1(), null);
        validate(date_2_Bytes, dg.generateDate_2(), null);
        validate(double_0_0_Bytes, dg.generateDouble_0_0(), null);
        validate(double_0_001_Bytes, dg.generateDouble_0_001(), null);
        validate(double_127_0_Bytes, dg.generateDouble_127_0(), null);
        validate(double_128_0_Bytes, dg.generateDouble_128_0(), null);
        validate(double_1_0_Bytes, dg.generateDouble_1_0(), null);
        validate(double_2_0_Bytes, dg.generateDouble_2_0(), null);
        validate(double_32767_0_Bytes, dg.generateDouble_32767_0(), null);
        validate(double_3_14159_Bytes, dg.generateDouble_3_14159(), null);
        validate(double_65_536_Bytes, dg.generateDouble_65_536(), null);
        validate(double_m0_001_Bytes, dg.generateDouble_m0_001(), null);
        validate(double_m128_0_Bytes, dg.generateDouble_m128_0(), null);
        validate(double_m129_0_Bytes, dg.generateDouble_m129_0(), null);
        validate(double_m32768_0_Bytes, dg.generateDouble_m32768_0(), null);
        validate(false_Bytes, dg.generateFalse(), null);
        validate(int_0_Bytes, dg.generateInt_0(), null);
        validate(int_0x30_Bytes, dg.generateInt_0x30(), null);
        validate(int_0x3ffff_Bytes, dg.generateInt_0x3ffff(), null);
        validate(int_0x40000_Bytes, dg.generateInt_0x40000(), null);
        validate(int_0x7ff_Bytes, dg.generateInt_0x7ff(), null);
        validate(int_0x7fffffff_Bytes, dg.generateInt_0x7fffffff(), null);
        validate(int_0x800_Bytes, dg.generateInt_0x800(), null);
        validate(int_1_Bytes, dg.generateInt_1(), null);
        validate(int_47_Bytes, dg.generateInt_47(), null);
        validate(int_m0x40000_Bytes, dg.generateInt_m0x40000(), null);
        validate(int_m0x40001_Bytes, dg.generateInt_m0x40001(), null);
        validate(int_m0x800_Bytes, dg.generateInt_m0x800(), null);
        validate(int_m0x80000000_Bytes, dg.generateInt_m0x80000000(), null);
        validate(int_m0x801_Bytes, dg.generateInt_m0x801(), null);
        validate(int_m16_Bytes, dg.generateInt_m16(), null);
        validate(int_m17_Bytes, dg.generateInt_m17(), null);
        validate(long_0_Bytes, dg.generateLong_0(), null);
        validate(long_0x10_Bytes, dg.generateLong_0x10(), null);
        validate(long_0x3ffff_Bytes, dg.generateLong_0x3ffff(), null);
        validate(long_0x40000_Bytes, dg.generateLong_0x40000(), null);
        validate(long_0x7ff_Bytes, dg.generateLong_0x7ff(), null);
        validate(long_0x7fffffff_Bytes, dg.generateLong_0x7fffffff(), null);
        validate(long_0x800_Bytes, dg.generateLong_0x800(), null);
        validate(long_0x80000000_Bytes, dg.generateLong_0x80000000(), null);
        validate(long_1_Bytes, dg.generateLong_1(), null);
        validate(long_15_Bytes, dg.generateLong_15(), null);
        validate(long_m0x40000_Bytes, dg.generateLong_m0x40000(), null);
        validate(long_m0x40001_Bytes, dg.generateLong_m0x40001(), null);
        validate(long_m0x800_Bytes, dg.generateLong_m0x800(), null);
        validate(long_m0x80000000_Bytes, dg.generateLong_m0x80000000(), null);
        validate(long_m0x80000001_Bytes, dg.generateLong_m0x80000001(), null);
        validate(long_m0x801_Bytes, dg.generateLong_m0x801(), null);
        validate(long_m8_Bytes, dg.generateLong_m8(), null);
        validate(long_m9_Bytes, dg.generateLong_m9(), null);
        validate(null_Bytes, dg.generateNull(), null);
        validate(object_1_Bytes, dg.generateObject_1(), "object");
        validate(object_2_Bytes, dg.generateObject_2(), "object");
        validate(object_3_Bytes, dg.generateObject_3(), "object");
        validate(object_4_Bytes, dg.generateObject_4(), "object");
        validate(string_0_Bytes, dg.generateString_0(), null);
        validate(string_1_Bytes, dg.generateString_1(), null);
        validate(string_31_Bytes, dg.generateString_31(), null);
        validate(string_32_Bytes, dg.generateString_32(), null);
        validate(string_null_Bytes, dg.generateString_null(), null);
        validate(true_Bytes, dg.generateTrue(), null);
        validate(typedFixedList_0_Bytes, dg.generateTypedFixedList_0(), "string[]");
        validate(typedFixedList_1_Bytes, dg.generateTypedFixedList_1(), "string[]");
        validate(typedFixedList_7_Bytes, dg.generateTypedFixedList_7(), "string[]");
        validate(typedFixedList_8_Bytes, dg.generateTypedFixedList_8(), "string[]");
        validate(typedMap_0_Bytes, dg.generateTypedMap_0(), "map");
        validate(typedMap_1_Bytes, dg.generateTypedMap_1(), "map");
        validate(typedMap_2_Bytes, dg.generateTypedMap_2(), "map");
        validate(typedMap_3_Bytes, dg.generateTypedMap_3(), "map");
        validate(untypedFixedList_0_Bytes, dg.generateUntypedFixedList_0(), "list");
        validate(untypedFixedList_1_Bytes, dg.generateUntypedFixedList_1(), "list");
        validate(untypedFixedList_7_Bytes, dg.generateUntypedFixedList_7(), "list");
        validate(untypedFixedList_8_Bytes, dg.generateUntypedFixedList_8(), "list");
        validate(untypedMap_0_Bytes, dg.generateUntypedMap_0(), "map");
        validate(untypedMap_1_Bytes, dg.generateUntypedMap_1(), "map");
        validate(untypedMap_2_Bytes, dg.generateUntypedMap_2(), "map");
        validate(untypedMap_3_Bytes, dg.generateUntypedMap_3(), "map");
    }

    private static void validate(byte[] bytes, Object obj, String type) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(bytes);
        bout.close();
        byte[] body = bout.toByteArray();

        ByteArrayInputStream bin = new ByteArrayInputStream(body, 0, body.length);
        Hessian2Input hin = new Hessian2Input(bin);

        if (type == null) {
            type = "";
        }
        isEqual(obj, hin.readObject(), type);
        hin.close();
    }
}
