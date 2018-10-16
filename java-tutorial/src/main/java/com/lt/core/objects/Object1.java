package com.lt.core.objects;

public class Object1 {
    public static void main(String... arg){
        boolean y =maths(2);
        System.out.println(y);
    }
    public static boolean maths (int x){
        int c=(x*x*x);
        int d=(x*x+2*x);
        return (c>d);
    }
    public void sayhello (String name){
        System.out.println("hello ! " +name);
    }
}
