package main.java.com.lt.core.questions;

public class PositiveAndNegative {
    public static void main(String... arg) {
        determine(15);

    }

    public static void determine(int a) {
        if (a > 0) {
            System.out.println("No is positive");
        }
        else if (a <= 0) {
            System.out.println("No is Negative");
        }
        else if (a == 0) {
            System.out.println("No is Zero");
        }
        else {
            System.out.println("No use for any no");
        }

    }
}
