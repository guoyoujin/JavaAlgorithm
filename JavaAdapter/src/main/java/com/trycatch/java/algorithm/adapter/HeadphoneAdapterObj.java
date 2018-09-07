package com.trycatch.java.algorithm.adapter;

public class HeadphoneAdapterObj implements IPhone7 {
    private HeadPhoneChild headPhoneChild = null;

    public HeadphoneAdapterObj(){

    }

    public  HeadphoneAdapterObj(HeadPhoneChild headPhoneChild) {
        this.headPhoneChild = headPhoneChild;
    }

    public void listenWithCommon(){
        headPhoneChild.listenWithCommon();
    }

    @Override
    public void listenWithLightning() {
        System.out.println(this.getClass().getName()+" : "+"listenWithLightning");

    }
}
