package com.trycatch.java.algorithm.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LazySingletonTest {

    @Test
    public void test()
    {
        LazySingleton lazySingletonFirst = LazySingleton.newInstance();
        LazySingleton lazySingletonSecond = LazySingleton.newInstance();
        Assert.assertEquals("object !=",lazySingletonFirst,lazySingletonSecond); // 验证是相等
        Assert.assertEquals("object !=",lazySingletonFirst,new LazySingleton()); // 验证不相等，抛出异常
    }
}
