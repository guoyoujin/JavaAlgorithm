package com.trycatch.java.algorithm.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void strReverse(){
       System.out.println(StringMethod.strReverse("1234567"));
    }

    @Test
    public void strReverseRecursive(){
        System.out.println(StringMethod.strReverseRecursive("1234567"));

    }

    @Test
    public void decodeString(){
        System.out.println(StringMethod.decodeString("1234567"));
        System.out.println(StringMethod.decodeString("2[abc]3[cd]ef"));
    }
}
