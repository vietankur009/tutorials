package com.lt.core.String;

public class StringTest2 {
    public static void main(String... arg){
        String a = "PREM LATA DAVI";
        String b = "Ankur";
        b = b.concat(" Ankit ");
        System.out.println(b);
        System.out.println(b.concat(" ") +a.concat(" RAM "));
    }
}
