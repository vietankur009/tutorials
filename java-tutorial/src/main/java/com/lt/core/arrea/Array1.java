package com.lt.core.arrea;

public class Array1 {
    public static void main(String... arg){
        int [] i= new int[50];
        i[2]= 5;
        i[49]=8;
        i[35]=543;
        for(int x = 0; x<=49; x=x+1){
            System.out.println(i[x]);
        }

    }
}
