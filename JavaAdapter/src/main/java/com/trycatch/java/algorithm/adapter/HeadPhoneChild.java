package com.trycatch.java.algorithm.adapter;

public class HeadPhoneChild extends Headphone {
    public HeadPhoneChild(){

    }
    @Override
    public void listenWithCommon() {
        System.out.println(this.getClass().getName()+" : "+"listenWithCommon");
    }
}
