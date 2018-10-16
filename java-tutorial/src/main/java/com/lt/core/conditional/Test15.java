package com.lt.core.conditional;

public class Test15 {
    public static void main(String... arg){
        double z = 4;
        paino(z);
    }
    public static void paino(double r){
        if(r>4){
        double d = (2*3.14*r);
            System.out.println(d);
        }else{
            double k = (3.14*r*r);
            System.out.println(k);
        }
    }
}
