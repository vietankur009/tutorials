package com.lt.core.looping;

public class LoopingTest18 {
    public static void main(String... arg){
        for(int x = 5; x>=1; x=x-1){
            for(int j = 1; j>=x; j=j-1){
                System.out.print("");
            }
            for(int a = x; a>=1; a=a-1){
                System.out.print(a);
            }
            System.out.println("");
        }
    }
}
