package com.lt.core.loop;

public class LoopTest8 {
    public static void main(String... arg){
        int x = 5;
        while (x>=1){
            int j = 1;
            while (j<=x){
                System.out.print(j);
                j=j+1;
            }
            x=x-1;
            System.out.println(" ");
        }

    }
}
