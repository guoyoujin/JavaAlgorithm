package com.trycatch.java.algorithm.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChooseSort {
    public static int[] sort(int[] array){
        if (array==null || array.length<=0) return null;
        int i=0,j=0,temp=0,count=0;
        System.out.println("数组:"+Arrays.toString(array));
        for (i=0;i<array.length;i++){
            for (j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    System.out.println("交换:"+Arrays.toString(array));
                }
                count++;
            }
            System.out.println("交换之后:"+Arrays.toString(array));
        }
        System.out.println("交换结果:"+count);
        return array;
    }


    public static int[] chooseSort(int[] array){
        if (array==null || array.length<=0) return null;
        int i=0,j=0,temp=0,count=0;
        for (i=0;i<array.length;i++){
            int k = i;
            for (j=i+1;j<array.length;j++){
                if(array[j]<array[k]){
                    k = j;
                }
            }
            if(k!=i){
                temp = array[i];
                array[i]=array[k];
                array[k]=temp;
            }
        }
        return array;
    }
}
