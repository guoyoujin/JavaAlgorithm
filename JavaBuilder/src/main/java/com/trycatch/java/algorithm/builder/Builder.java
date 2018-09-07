package com.trycatch.java.algorithm.builder;

public abstract class Builder {
    private Product product = new Product();

    public Product getProduct() {
        return product;
    }

    public abstract void buildInput(String input);
    public abstract void buildName(String name);
    public abstract void buildData(String data);
    public abstract void buildOut(String out);
}
