package com.trycatch.java.algorithm.sort;

import java.util.Arrays;

public class InsertSort {
    public static int[] sort(int[] array){
        if (array==null || array.length<=0) return null;
        int i=0,j=0,temp=0,count=0;
        System.out.println("原数组："+Arrays.toString(array));
        for (i=0;i<array.length;i++){
            for (j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    System.out.println("交换中："+Arrays.toString(array));
                }
                count++;
            }
            System.out.println("交换后："+Arrays.toString(array));
        }
        System.out.println(count);
        return array;
    }

    public static int[] heightSort(int[] array){
        if (array==null || array.length<=0) return null;
        int i=0,j=0,temp=0,count=0;
        System.out.println("原数组："+Arrays.toString(array));
        for (i=1;i<array.length;i++){
            temp = array[i];
            for (j=i;j>=0;j--){
                count++;
                if(j>0 && temp < array[j-1]){
                    array[j] = array[j-1];
                    System.out.println("交换中："+Arrays.toString(array));
                }else{
                    array[j] = temp;
                    break;
                }
                count++;
            }
            System.out.println("交换后："+Arrays.toString(array));
        }
        System.out.println(count);
        return array;
    }
}


