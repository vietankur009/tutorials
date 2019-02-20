package main.java.com.lt.core.questions;

public class Divisible {
    public static void main(String... arg) {
        divided(15);
    }
    public static void divided(int x) {
        int divisible = (x % 10);
        if (divisible == 0) {
            System.out.println("Given no is Divisible by 10");
        } else {
            System.out.println("Given no is not Divisible by 10");
        }
    }
}
