package com.lt.core.nonstatic;

public class Test3 {
    public static void main (String... arg){
        Test3 test3 = new Test3();
        int g = test3.cuabing(5,6,4);
        int k = test3.squre(5,5);
        double h = test3.pai(5);
        double j = test3.simpleInterest(5,5,5);
        double a = test3.cube(5,5,6);
        double f = test3.valueofcube(4,8,9);
        System.out.println(f);
        System.out.println(a);
        System.out.println(j);
        System.out.println(h);
        System.out.println(k);
        System.out.println(g);
    }
    public int cuabing (int a, int b, int c){

        return (a*b*c);
    }
    public int squre (int d, int f){

        return (d*f);
    }
    public double pai (double r){

        return (22/7*r*r);
    }
    public double simpleInterest(double p, double r, double t){

        return (p*r*t/100);
    }
    public double cube (double n, double m, double v){

        return (2*n*(m+v));
    }
    public double valueofcube(double h, double g, double t){

        return(h*g*t);
    }

}
