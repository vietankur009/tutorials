package com.lt.core.looping;

public class LoopingTest5 {
    public static void main(String... arg){
        for(int a = 100; a>=0; a=a-1){
            System.out.println(a);
            if(a%2==0){
                System.out.println("Given No Is Even");
            }else{
                System.out.println("Given No Is Odd");
            }
        }
    }
}
