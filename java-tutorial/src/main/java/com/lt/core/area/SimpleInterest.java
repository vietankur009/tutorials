package com.lt.core;

public class SimpleInterest {
    public static void main(String... arg){

        double t=SimpleInterest(10,15,5);

        System.out.println(t);

    }
    public static double SimpleInterest(double first, double second, double third){

        return(first*second*third)/100;
    }
}
