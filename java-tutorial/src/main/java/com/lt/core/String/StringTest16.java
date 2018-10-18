package com.lt.core.String;

public class StringTest16 {
    public static void main(String... arg){
        String x = "Ankit Is Learning Java";
        String [] y = x.split(" ");
        for(int j = 0; j<y.length; j=j+1){
            System.out.println(y[j]);
        }
    }
}
