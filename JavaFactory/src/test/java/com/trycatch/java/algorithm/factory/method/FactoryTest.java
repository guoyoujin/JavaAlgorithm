package com.trycatch.java.algorithm.factory.method;

import org.junit.Test;

public class FactoryTest {
    @Test
    public void test(){
       FactoryPig factoryPig = new FactoryPig();
       factoryPig.manFacture().outPut();

        FactoryDog factoryDog = new FactoryDog();
        factoryDog.manFacture().outPut();
    }
}
