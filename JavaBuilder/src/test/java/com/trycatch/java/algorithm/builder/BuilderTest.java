package com.trycatch.java.algorithm.builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test(){
       Product product =  new Director(new ConcreteBuilder()).construct();
       System.out.println(product.toString());
    }
}

