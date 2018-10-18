package com.lt.core.String;

public class StringTest17 {
    public static void main(String... arg){
        String x = "Ankit Is Learning Java";
        String [] y = x.split(" ");
        for(int j = 0; j<y.length; j=j+1){
            System.out.println(y[j]);
        }
        System.out.println("================*Reversel program*================");
        for(int a= y.length-1; a>=0; a=a-1){
            System.out.println(y[a]);
        }
    }
}
