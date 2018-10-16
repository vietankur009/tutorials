package com.lt.core.loop;

public class LoopTest7 {
    public static void main(String... arg) {
        int a = 1;
        while (a<=5){
            int j = 1;
            while (j<=a){
                System.out.print(j);
                j=j+1;
            }
            a=a+1;
            System.out.println(" ");
        }

    }

}
