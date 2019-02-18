package main.java.com.lt.core.questions;

public class TemperatureConverter {

    public static void main(String... arg) {
        celsiusToFahrenheit();
    }

    public static void celsiusToFahrenheit() {

        double fahrenheit, celsius;
        fahrenheit = 10;
        celsius = fahrenheit * 32;
        System.out.println(fahrenheit + " Degree Fahrenheit =   " + celsius + " Degree Celsius");
    }
}