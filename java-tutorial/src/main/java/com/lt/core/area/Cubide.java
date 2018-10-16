package com.lt.core;

public class Cubide {

    public static void main(String... arg){
        int c = math(2,2,2);
        System.out.println(c);
    }
    public static int math(int l,int b,int h){
        return(l*b+ b*h +h*l);
    }
}
