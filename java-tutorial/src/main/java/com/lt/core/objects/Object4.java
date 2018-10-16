package com.lt.core.objects;

public class Object4 {
    public static void main(String... arg){
        boolean c = formula(1,2,3);
        System.out.println(c);
    }
    public static boolean formula(int l, int b , int h){
        int a = (l*b*h);
        int i = (2*l*b+b*h+h*l);
        return (a==i);
    }
}
