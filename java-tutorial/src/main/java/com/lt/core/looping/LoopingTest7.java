package com.lt.core.looping;

public class LoopingTest7 {
    public static void main(String... arg){
        int a = 0;
        for(int x = 0; x<=100; x=x+2){
            a = a+x;
        }
        System.out.println(a);
    }
}
