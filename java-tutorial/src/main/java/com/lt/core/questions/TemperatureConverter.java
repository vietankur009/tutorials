package main.java.com.lt.core.questions;

public class TemperatureConverter {

    public static void main(String... arg) {
        celsiusToFahrenheit(10.0);
    }

    public static void celsiusToFahrenheit(double fahrenheit) {

        double celsius;
        celsius = fahrenheit * 32;
        System.out.println(fahrenheit + " Degree Fahrenheit =   " + celsius + " Degree Celsius");
    }
}