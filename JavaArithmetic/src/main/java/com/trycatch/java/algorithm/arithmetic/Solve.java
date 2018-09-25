package com.trycatch.java.algorithm.arithmetic;

public class Solve {

    public static void solve(int num){
        for(int i = 2;i<=num; i++){
            if(i == num){
                System.out.println(i);
                return;
            }
            if(i < num && num%i==0){
                System.out.println(i);
                solve(num/i);
                break;
            }
        }
    }

    public static void solve2(int num){
        for (int i = 2 ; i <= num; i++){
            while (num!=i){
                if(num%i!=0){
                    break;
                }
                System.out.println(i);
                num = num/i;
            }
        }
        System.out.println(num);

    }
}
