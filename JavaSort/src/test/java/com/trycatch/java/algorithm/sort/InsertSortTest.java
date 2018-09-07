package com.trycatch.java.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

public class InsertSortTest {

    @Test
    public void sort()
    {
        int[] array = {51,56,1,2,3,27,10,45,90,3,24,56,36,12,10,9};
        InsertSort.sort(array);
        System.out.println("end result ============>");
        System.out.println(Arrays.toString(array));
    }


    @Test
    public void heightSort()
    {
        int[] array = {51,56,1,2,3,27,10,45,90,3,24,56,36,12,10,9};
        InsertSort.heightSort(array);
        System.out.println("end result ============>");
        System.out.println(Arrays.toString(array));
    }
}
