package com.lt.core;

import com.lt.core.Multiply;

public class Cuabing {

    public static void main(String... arg){
        int t=cube(5);
        System.out.println(t);

    }
    public static int cube(int first){
        int multiply= Multiply.multiply(10,20);
        System.out.println(multiply);
        return(first*first*first);
    }
}
