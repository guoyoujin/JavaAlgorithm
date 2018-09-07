package com.trycatch.java.algorithm.strategy;

import org.junit.Test;

public class OperationContextTest {
    @Test
    public void test(){
        System.out.println("相加结果："+ new OperationContext("+").executeStrategy(10,20));

        System.out.println("相减结果："+ new OperationContext("-").executeStrategy(10,20));

        System.out.println("相乘结果："+ new OperationContext("*").executeStrategy(10,20));
    }
}
