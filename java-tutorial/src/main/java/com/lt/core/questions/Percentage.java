package main.java.com.lt.core.questions;

public class Percentage {
    public static void main(String... arg) {
        double t = percentage(1, 12, 3, 4, 15);
        System.out.println(t);
    }

    public static double percentage(int a, int b, int c, int d, int e) {
        double f = (a + b + c + d + e) / 5;
        return f;
    }
}
