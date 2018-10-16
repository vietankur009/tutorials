package com.lt.core.looping;

public class LoopingTest15 {
    public static void main(String... arg) {
        int a = 0;
        for(int x =0; x<=100; x=x+1){
            if ((x%7==0)&&(x%8==0)){
                a=a+x;
               // System.out.println(x);
            }
        }
        System.out.println(a);
    }
}
