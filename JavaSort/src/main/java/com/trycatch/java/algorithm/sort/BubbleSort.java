package com.trycatch.java.algorithm.sort;

import java.util.Arrays;

public class BubbleSort {
    /**
     * 简单冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] easyBubbleSort(int[] array){
        if (array != null && array.length<=0) return null;
        int arrayLength = array.length;
        int j = 0 , i = 0 ,temp = 0,count = 0;
        for(i = 0;i<arrayLength;i++){
            for(j = 0;j<arrayLength-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
                count++;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(count);
        return array;
    }

    /**
     * 中级冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] intermediateBubbleSort(int[] array){
        if (array != null && array.length<=0) return null;
        int arrayLength = array.length;
        boolean flag = true;
        int j = 0 , i = 0 ,temp = 0,count = 0;
        for(i = 0;i<arrayLength;i++){
            if(flag){
                flag=false;
                for(j = 0;j<arrayLength-i-1;j++){
                    if(array[j]>array[j+1]){
                        temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                        flag = true;
                    }
                    count++;
                }
            }else{
                System.out.println(count);
                return array;
            }
            System.out.println(Arrays.toString(array));
        }
        System.out.println(count);
        return array;
    }


    /**
     * 高级冒泡排序
     *
     * @param array
     * @return
     */
    public static int[] heightBubbleSort(int[] array){
        if (array != null && array.length<=0) return null;
        int arrayLength = array.length;
        int i = 0 , j = 0  ,k = array.length,temp = 0,count = 0;
        while (k > 0){
            j=k;
            k=0;
            for(i=0;i<j-1;i++){
                if(array[i]>array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    k = j;

                }
                System.out.println(Arrays.toString(array));
                count++;
            }
        }
        System.out.println(count);
        return array;
    }
}
