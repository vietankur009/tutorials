package com.lt.core.loop;

public class LoopTest3 {
    public static void main(String... arg){
        int a = 2;
        while (a<=100){
            System.out.println(a);
            if(a%2==0){
                System.out.println("No is divied by 2");
            }
            if(a%3==0){
                System.out.println("No is divied by 3");
            }
            a=a+1;
        }

    }
}
