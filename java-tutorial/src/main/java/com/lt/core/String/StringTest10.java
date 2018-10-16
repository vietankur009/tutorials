package com.lt.core.String;

public class StringTest10 {
    public static void main(String... args){
        String k = "PREM";
        byte[] x = k.getBytes();
        for(int i = 0; i<x.length; i=i+1){
            System.out.println(x[i]);
        }
    }
}
