package main.java.com.lt.core.questions;

public class Temperature {

    public static void main(String... args) {

        temperature(32.0);
    }

    public static void temperature(double celsius) {
        double fahrenheit;

        fahrenheit = celsius / 32;

        System.out.println(fahrenheit + " Degree Fahrenheit =   " + celsius + " Degree Celsius");

    }
}






