package com.trycatch.java.algorithm.factory.method;


public class FactoryPig extends Factory {

    @Override
    public Product manFacture() {
        return new ProductPig();
    }
}
