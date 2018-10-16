package com.lt.core.conditional;

public class Test17 {
    public static void main(String... arg){
        int x = 12;
        number(x);
    }
    public static void number(int a){
        if (a>11){
            System.out.println(a*1000);
        }else{
            System.out.println(a*a);
        }
    }
}
