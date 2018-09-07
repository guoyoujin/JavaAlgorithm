package com.trycatch.java.algorithm.factory.abst;

import org.junit.Test;

public class FatcoryTest {

    @Test
    public void test(){
        FactoryZoom factoryZoom = new FactoryZoom();
        factoryZoom.manufactureContainer().outPut();




        FactoryFruit factoryFruit = new FactoryFruit();
        factoryFruit.manufactureContainer().outPut();


    }
}
