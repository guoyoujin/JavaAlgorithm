package com.trycatch.java.algorithm.adapter;

public class HeadphoneAdapter extends Headphone implements IPhone7 {
    @Override
    public void listenWithCommon() {
        System.out.println(this.getClass().getName()+" : "+"listenWithCommon");
    }

    @Override
    public void listenWithLightning() {
        System.out.println(this.getClass().getName()+" : "+"listenWithLightning");
    }
}
