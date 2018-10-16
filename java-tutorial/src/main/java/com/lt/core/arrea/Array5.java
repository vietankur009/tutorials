package com.lt.core.arrea;

public class Array5 {
    public static void main(String... arg){
        String[] a= new String[10];
        for (int x = 0; x<=10; x=x+1){
            a[x] = "ankit"+" " + x;
        }
        for (int j = 10; j<=0; j=j+1){

            System.out.println(a[j]);
        }

    }
}
