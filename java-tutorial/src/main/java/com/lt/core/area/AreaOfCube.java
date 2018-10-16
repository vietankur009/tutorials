package com.lt.core;

public class AreaOfCube {
    public static void main(String... arg){
        int x=AreaOfCube(5,5,5);
        System.out.println(x);

    }
    public static int AreaOfCube(int h,int l,int b){
        return (2*h*(l+b));
    }
}
