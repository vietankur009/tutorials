package com.lt.core.looping;

public class LoopingTest20 {
    public static void main(String... arg){
        for(int x = 5; x>=1; x=x-1){
            for(int j = 1; j<=x; j=j+1){
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}
