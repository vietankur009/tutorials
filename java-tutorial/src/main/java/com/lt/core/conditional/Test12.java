package com.lt.core.conditional;

public class Test12 {
    public static void main(String... arg){
        int x = 12;
        evenoroddnumber(x);
    }
    public static void evenoroddnumber(int a){
        int c = (a%2);
        if (c==0){
            System.out.println("given no is even");
        }else{
            System.out.println("given no is odd");
        }
    }
}