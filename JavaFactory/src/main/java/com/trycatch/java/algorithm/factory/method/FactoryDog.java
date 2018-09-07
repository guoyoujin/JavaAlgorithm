package com.trycatch.java.algorithm.factory.method;


public class FactoryDog extends Factory{
    @Override
    public Product manFacture() {
        return new ProductDog();
    }
}
