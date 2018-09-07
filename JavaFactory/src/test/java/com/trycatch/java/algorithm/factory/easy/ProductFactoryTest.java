package com.trycatch.java.algorithm.factory.easy;

import com.trycatch.java.algorithm.factory.easy.ProductFactory;
import org.junit.Test;

public class ProductFactoryTest {
    @Test
    public void test(){
        ProductFactory productFactory = new ProductFactory();
        try{
            productFactory.manufacture("dog").outPut();
        }catch (NullPointerException e){
            System.out.println("not product");
        }

        try{
            productFactory.manufacture("pig").outPut();
        }catch (NullPointerException e){
            System.out.println("not product");
        }

        try{
            productFactory.manufacture("brid").outPut();
        }catch (NullPointerException e){
            System.out.println("not product");
        }
    }
}
