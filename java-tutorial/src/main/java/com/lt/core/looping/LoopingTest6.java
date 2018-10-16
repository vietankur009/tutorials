package com.lt.core.looping;

public class LoopingTest6 {
    public static void main(String... arg){
        String x = arg[0];
        int b = Integer.parseInt(x);
        for(int c = 1; c<=10; c=c+1){
            System.out.println(b*c);
        }
    }
}
