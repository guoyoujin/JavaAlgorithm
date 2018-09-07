package com.trycatch.java.algorithm.factory.abst;

public class FactoryFruit extends Factory{
    @Override
    public AbstractProduct manufactureContainer() {
        return new ProductOrg();
    }
}
