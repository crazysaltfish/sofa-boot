/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.alipay.sofa.boot.test.serialize;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * SerializeTest
 *
 * 常用的序列化组件测试：JAVA、fastjson、gson、jackson、jsonlib、Hessian 2、Protobuf 等
 *
 * @author xunfang
 * @version SerializeTest.java, v 0.1 2023/7/13
 */
public class SerializeTest {
    private static final TestObject testObject = new TestObject();


    @Test
    public void jdkSerializeTest() {

    }

    @Test
    public void hessianSerializeTest() throws IOException {
        byte[] bytes;
        Object result;

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Hessian2Output output = new Hessian2Output(os);
        output.writeObject(testObject);
        output.flush();
        output.close();
        bytes = os.toByteArray();

        ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        Hessian2Input input = new Hessian2Input(is);
        result = input.readObject();
        input.close();

        Assert.assertNotNull(result);
        Assert.assertEquals(result.toString(), testObject.toString());
    }

}
