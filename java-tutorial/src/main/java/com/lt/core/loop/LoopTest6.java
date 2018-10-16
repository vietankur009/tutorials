package com.lt.core.loop;

public class LoopTest6 {
    public static void main(String... arg){
        int a = 0;
        while (a<=100){
            System.out.println(a);
            if(a%8==0){
                System.out.println("No is divied by 8");
            }else {
                System.out.println("no is no divied by 8");
            }
            a=a+1;
        }
    }
}
