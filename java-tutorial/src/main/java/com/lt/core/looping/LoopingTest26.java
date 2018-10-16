package com.lt.core.looping;

public class LoopingTest26 {
    public static void main(String... arg){
        for(int x = 1; x<=5; x=x+1){
            for(int j = 5; j>=x; j=j-1){
                System.out.print(" ");
            }
            for(int b = 1; b<=x; b=b+1){
                System.out.print("2");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
