package com.lt.core.looping;

public class LoopingTest14 {
    public static void main(String... arg){

        int a = 0;
        for(int b = 0; b<=100; b=b+1){

            if((b%4==0)||(b%3==0)||(b%2==0)){
                a=a+b;
                System.out.println(b);
            }
        }
        System.out.println(a);
    }
}
