package com.lt.core.looping;

public class LoopingTest17 {
    public static void main(String... arg){
        for(int x = 1; x<=5; x=x+1){
            for(int a = 1; a<=x; a=a+1) {
                System.out.print(a);
            }
            System.out.println("");

        }

    }
}
