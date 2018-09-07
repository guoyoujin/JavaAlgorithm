package com.trycatch.java.algorithm.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }
    public Product construct(){
        builder.buildInput("开始输入");
        builder.buildName("设置名字");
        builder.buildData("设置物料");
        builder.buildOut("选择出库");
        return builder.getProduct();
    }
}
