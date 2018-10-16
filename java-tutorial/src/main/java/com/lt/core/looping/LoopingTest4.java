package com.lt.core.looping;

public class LoopingTest4 {
    public static void main(String... arg){
        for(int a = 2; a<=100; a=a+1){
            System.out.println(a);
            if(a%2==0){
                System.out.println("No is divied by 2");
            }
            if(a%3==0){
                System.out.println("No is divied by 3");
            }
        }
    }
}
