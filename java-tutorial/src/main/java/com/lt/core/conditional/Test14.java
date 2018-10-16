package com.lt.core.conditional;

public class Test14 {
    public static void main(String... arg){
        String r = ("F");
        checkgender(r);

    }
    public static void checkgender(String x){
        if (x=="M"){
            System.out.println("Gender is Male");
        }else{
            System.out.println("gender is female");
        }
    }
}
