package main.java.com.lt.core.questions;

public class Alphabet {
    public static void main(String... arg){
        int ch = 0;
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.print(" is an Alphabet");
        }
        else if(ch>=0 && ch<=1000){
            System.out.println("Digit");
        }else {
            System.out.print("is not an Alphabet");
        }
    }
}


