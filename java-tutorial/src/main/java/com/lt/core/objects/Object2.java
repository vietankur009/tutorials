package com.lt.core.objects;

public class Object2 {
    public static void main (String... arg){
        boolean t = formula(1,3);
        System.out.println(t);

    }
    public static boolean formula(int x, int y){
        int a =(x*y);
        int c = ((x+y))*2;
        return ((x*y) > (x+y)*2);
    }
}
