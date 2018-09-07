package com.trycatch.java.algorithm.singleton;

public class LazySingleton {
    private static  LazySingleton lazySingleton = null;
    public LazySingleton(){

    }

    /**
     * 需要是才手动创建
     * @return
     */
    public static LazySingleton newInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
