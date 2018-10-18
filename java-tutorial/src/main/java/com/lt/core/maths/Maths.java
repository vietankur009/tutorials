package com.lt.core;

public class Maths {

    public static void main(String... arg){

        System.out.println("Inside main mathord");
        int sum = addNumbers(10,20);
        System.out.println(sum);

    }
    public static int addNumbers(int first , int second){

        return (first+second);
    }
}
