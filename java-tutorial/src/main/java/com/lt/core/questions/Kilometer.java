package main.java.com.lt.core.questions;


public class Kilometer {
    public static void main(String... arg) {

        kilometers(7);
    }

    public static void kilometers(double kilometers) {
        double meters;
        meters = kilometers * 1000;

        System.out.println("Length in Kilometers = " + kilometers + "km");

    }
}
