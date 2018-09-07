package com.trycatch.java.algorithm.adapter;

public class HeadphoneAdapterIntf extends IntfAdapter{
    @Override
    public void listenWithLightning() {
        System.out.println(this.getClass().getName()+" : "+"listenWithLightning");
    }
}
