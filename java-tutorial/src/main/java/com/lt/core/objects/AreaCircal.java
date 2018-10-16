package com.lt.core.objects;

public class AreaCircal {
    public static void main (String...arg){
        boolean y = circal(5);
        System.out.println(y);
    }
    public static boolean circal(double r){
        double a = (22/7*r*r);
        System.out.println(a);
        double b = (2*22/7*r*2);
        System.out.println(b);
        double c = (22/7*r);
        System.out.println(c);
        return(a>b);
    }

    public void sayHello(String name){

        System.out.println("Hello ! "+name);
    }
}
