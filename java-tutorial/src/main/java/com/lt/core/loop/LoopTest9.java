package com.lt.core.loop;

public class LoopTest9 {
    public static void main(String... arg){
        int x = 5;
        while (x>=1){
            int j = x;
            while (j>=1){
                System.out.print(j);
                j=j-1;
            }
            x=x-1;
            System.out.println(" ");
        }
    }
}
