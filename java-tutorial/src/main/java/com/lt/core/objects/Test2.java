package com.lt.core.objects;

public class Test2 {
    public static void main(String... arg){
        Test2 test2 = new Test2 ();
        int y= test2.formula(2,5,7);
        System.out.println(y);
    }
    public int formula(int l, int b, int h){
        int a = (l*b*h);
        int i =(2*l*b+b*h+h*l);
        return (a*i);
    }
}
