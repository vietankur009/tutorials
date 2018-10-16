package com.lt.core.arrea;

public class Array2 {
    public static void main(String... arg){
        int [] a = {22,44,55,99,88};
        int [] b = new int[5];
        b = a;
        a[2]= 100;
        for(int j = 0; j<5; j=j+1){
            System.out.println(a[j]);
        }
        for(int c = 0; c<5; c=c+1){
            System.out.println(b[c]);
        }
    }
}
