package com.lt.core.looping;

public class LoopingTest27 {
    public static void main(String... arg){
        for(int a = 1; a<=5;a=a+1){
            for(int j = 1; j<=a; j=j+1) {
                System.out.print(a);
            }
            System.out.println(" ");
        }

    }
}
