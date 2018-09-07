package com.trycatch.java.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    @Test
    public void easyBubbleSort()
    {
        int[] array = {51,56,1,2,3,27,10,45,90,3,24,56,36,12,10,9};
        BubbleSort.easyBubbleSort(array);
        System.out.println("end result ============>");
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void intermediateBubbleSort()
    {
        int[] array = {51,56,1,2,3,27,10,45,90,3,24,56,36,12,10,9};
        BubbleSort.intermediateBubbleSort(array);
        System.out.println("end result ============>");
        System.out.println(Arrays.toString(array));
    }

    @Test
    public void heightBubbleSort()
    {
        int[] array = {51,56,1,2,3,27,10,45,90,3,24,56,36,12,10,9};
        BubbleSort.heightBubbleSort(array);
        System.out.println("end result ============>");
        System.out.println(Arrays.toString(array));
    }
}
