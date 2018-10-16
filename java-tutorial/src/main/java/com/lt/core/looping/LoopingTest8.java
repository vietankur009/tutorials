package com.lt.core.looping;

public class LoopingTest8 {
    public static void main(String... arg){
        for(int a = 0; a<=100; a=a+1){
            System.out.println(a);
            if(a%7==0){
                System.out.println("No is divied by 7");
            }else {
                System.out.println("no is no divied by 7");
            }
        }
    }
}
