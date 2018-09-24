package com.trycatch.java.algorithm.string;

import java.util.Stack;

public class StringMethod {


    /**
     * 单个字符串反转
     * @param str
     * @return
     */
    public static String strReverse(String str){
        char[] array = str.toCharArray();
        for (int i = 0 ; i<array.length/2;i++){
            char tmp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = tmp;
        }
        return new String(array);
    }

    /**
     * 单个字符串反转递归法
     * @param str
     * @return
     */
    public static String strReverseRecursive(String str){
        int strLength = str.length();
        if (str == null || strLength<=1){
            return str;
        }
        String left = str.substring(0,strLength/2);
        String right = str.substring(strLength/2,strLength);
        return strReverseRecursive(right)+strReverseRecursive(left);
    }

    /**
     * 字符串解码
     * s = "3[a]2[bc]",     return "aaabcbc".
     * s = "3[a2[c]]",      return "accaccacc".
     * s = "2[abc]3[cd]ef", return "abcabccdcdcdef"
     * @param str
     * @return
     */
    public static String decodeString(String str){
        Stack<Integer> countStack = new Stack<Integer>();
        Stack<String> stringStack = new Stack<String>();
        String result = "";
        int index = 0;
        while (index<str.length()){
            if(str.charAt(index)>='0' && str.charAt(index)<='9'){
                int count = 0;
                while (index<str.length() && str.charAt(index)>='0' && str.charAt(index)<='9'){
                    count = count*10 + (str.charAt(index)-'0');
                    index++;
                }
                countStack.push(count);
            }else if (str.charAt(index) == '['){
                stringStack.push(result);
                result = "";
                index++;
            }else if (str.charAt(index) == ']'){
                StringBuilder sb = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();
                int repead_index = 0;
                while (repead_index<repeat){
                    sb.append(result);
                    repead_index++;
                }
                result  = sb.toString();
                index++;
            }else{
                result += str.charAt(index);
                index++;
            }
        }
        return result;
    }

}
