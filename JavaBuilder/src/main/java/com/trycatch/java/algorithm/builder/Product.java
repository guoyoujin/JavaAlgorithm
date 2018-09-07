package com.trycatch.java.algorithm.builder;

public class Product {
    private String name;
    private String data;
    private String input;
    private String out;

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setOut(String out) {
        this.out = out;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", input='" + input + '\'' +
                ", out='" + out + '\'' +
                '}';
    }
}
