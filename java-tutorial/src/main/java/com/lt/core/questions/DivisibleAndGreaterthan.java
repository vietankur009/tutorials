package main.java.com.lt.core.questions;

public class DivisibleAndGreaterthan {
    public static void main(String... arg) {

        DivisibleAndGreaterthan f = new DivisibleAndGreaterthan();
        boolean k = f.greaterthan(10, 5);
        System.out.println(k);

        DivisibleAndGreaterthan g = new DivisibleAndGreaterthan();
        boolean r = f.equal(5.5, 4.5);
        System.out.println(r);

        divisible(10);
    }

    public static boolean greaterthan(int a, int b) {

        return (a > b);
    }

    public static boolean equal(double a, double b) {
        return (a == b);
    }

    public static void divisible(int c) {
        int divided = (c % 2);
        if (divided == 0) {
            System.out.println("No is Divisible by 2");
        } else if (divided % 3 == 0) {
            System.out.println("No is Divisible by 3");
        }
    }
}
