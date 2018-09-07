package com.trycatch.java.algorithm.adapter;

import org.junit.Test;

public class AdapterTest {
    @Test
    public void test1(){
        System.out.println("HeadphoneAdapter==========");
        HeadphoneAdapter headphoneAdapter = new HeadphoneAdapter();
        headphoneAdapter.listenWithCommon();
        headphoneAdapter.listenWithLightning();

        System.out.println("HeadphoneAdapterObj==========");
        HeadphoneAdapterObj headphoneAdapterObj = new HeadphoneAdapterObj(new HeadPhoneChild());
        headphoneAdapterObj.listenWithCommon();
        headphoneAdapterObj.listenWithLightning();


        System.out.println("HeadphoneAdapterIntf==========");
        HeadphoneAdapterIntf headphoneAdapterIntf = new HeadphoneAdapterIntf();
        headphoneAdapterIntf.listenWithLightning();
        headphoneAdapterIntf.listenWithCommon();
    }
}
