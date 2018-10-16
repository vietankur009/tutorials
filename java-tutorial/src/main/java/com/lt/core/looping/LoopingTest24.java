package com.lt.core.looping;

public class LoopingTest24 {
    public static void main(String... arg){
        for(int x = 1; x<=5; x=x+1){
            for(int j = 1; j<=x;j=j+1){
                System.out.print(" ");
            }
            for(int a = 5; a>=x; a=a-1){
                System.out.print("1");
            }
            System.out.println(" ");
        }
    }
}
