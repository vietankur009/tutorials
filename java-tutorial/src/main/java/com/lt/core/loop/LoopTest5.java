package com.lt.core.loop;

public class LoopTest5 {
    public static void main(String... arg){
        int a = 0;
        while (a<=100){
            System.out.println(a);
            if(a%7==0){
                System.out.println("No is divied by 7");
            }else {
                System.out.println("no is no divied by 7");

            }
            a=a+1;
        }
    }
}
