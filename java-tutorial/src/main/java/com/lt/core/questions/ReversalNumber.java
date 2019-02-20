package main.java.com.lt.core.questions;

public class ReversalNumber {
    public static void main(String... arg) {

        int a = 147324;
        String b = "" + (a % 100);
        a = a / 100;
        b = b + (a % 100);
        a = a / 100;
        System.out.println(b + a);

        reversal();
    }

    public static void reversal() {
        int a = 154230;
        String b = "" + (a % 10);
        a = a / 10;
        b = b + a % 10;
        a = a / 10;
        b = b + a % 10;
        a = a / 10;
        b = b + a % 10;
        a = a / 10;
        b = b + a % 10;
        a = a / 10;
        System.out.println(b + a);
    }

}
