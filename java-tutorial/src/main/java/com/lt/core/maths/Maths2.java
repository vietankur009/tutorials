package com.lt.core.maths;

public class Maths2 {

    public static void main(String... arg){

        int c= cube (5,5);

        System.out.println(c);
    }
    public static int cube(int a, int b){

        return(a*a*a+b*b*b+2*a*b*(a+b));
    }

}
