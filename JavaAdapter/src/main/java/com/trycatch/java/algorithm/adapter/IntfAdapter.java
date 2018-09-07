package com.trycatch.java.algorithm.adapter;

public abstract class IntfAdapter extends Headphone implements IPhone7 {
    @Override
    public void listenWithCommon() {
        System.out.println(this.getClass().getName()+" : "+"listenWithCommon");
    }
}
