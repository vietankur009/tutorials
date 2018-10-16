package com.lt.core.looping;

public class LoopingTest28 {
    public static void main(String...arg){
        for(int a = 1; a<=5; a=a+1){
            int b = a;
            for(int c = 1; c<=a; c=c+1){
                System.out.print(b+"");
                b=b+5-c;
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
