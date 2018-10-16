package com.lt.core.objects;

public class Object3 {
    public static void main(String...arg){
        boolean c = formula(10,6);
        System.out.println(c);
    }
    public static boolean formula(int x, int y){
        int a = (x*y);
        int b = (x+y)*2;
        return (x*y)>(x+y)*2;
    }
}
