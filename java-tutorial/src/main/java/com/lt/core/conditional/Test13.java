package com.lt.core.conditional;

public class Test13 {
    public static void main (String... arg){
        int a = 23;
        diviable(a);
    }
    public static void diviable (int x){
        int c = (x%3);
        if (c==0){
            System.out.println("given no diviable by 3");
        }else {
            System.out.println("given no is not diviable by 3");
        }
    }
}
