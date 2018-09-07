package com.trycatch.java.algorithm.factory.abst;

public class FactoryZoom extends Factory{
    @Override
    public AbstractProduct manufactureContainer() {
        return new ProductDog();
    }

}
