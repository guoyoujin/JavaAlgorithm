package com.trycatch.java.algorithm.builder;

public class ConcreteBuilder extends Builder{
    @Override
    public void buildInput(String input) {
        System.out.println(this.getClass().getName()+" : "+input);
        getProduct().setInput(input);
    }

    @Override
    public void buildName(String name) {
        System.out.println(this.getClass().getName()+" : "+name);
        getProduct().setName(name);
    }

    @Override
    public void buildData(String data) {
        System.out.println(this.getClass().getName()+" : "+data);
        getProduct().setData(data);
    }

    @Override
    public void buildOut(String out) {
        System.out.println(this.getClass().getName()+" : "+out);
        getProduct().setOut(out);
    }
}
