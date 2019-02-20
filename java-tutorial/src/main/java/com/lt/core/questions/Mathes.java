package main.java.com.lt.core.questions;

public class Mathes {
    public static void main(String... arg) {

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);


        multiply(2, 6);

        Mathes d = new Mathes();
        d.add(3, 4, 5);

        Mathes f = new Mathes();
        f.sum(10.5, 2.5);

        Mathes v = new Mathes();
        v.evenNumber();


        checkOddNumber();

    }

    public static void multiply(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }

    public void add(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

    public void sum(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    public void evenNumber() {
        int u = 26;
        if (u % 2 == 0) {
            System.out.println("No is even");
        } else {
            System.out.println("Given No is Odd");
        }
    }

    public static void checkOddNumber() {
        int u = 15;
        if (u % 2 == 0) {
            System.out.println("No is Even");
        } else if (u % 3 == 0) {
            System.out.println("No is odd");
        } else {
            System.out.println("Thanks");
        }
    }
}
