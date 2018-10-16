package com.lt.core.loop;

public class LoopTest4 {
    public static void main(String... arg){
        int a = 100;
        while (a>=0){
            System.out.println(a);
            if(a%2==0){
                System.out.println("Given No Is Even");
            }else{
                System.out.println("Given No Is Odd");
            }
            a=a-1;
        }
    }
}
