package main.java.com.lt.core.questions;


public class LeapYear {

    public static void main(String... arg) {

        int a = 2020;

        if (a % 4 == 0) {

            System.out.println("This is a Leap Year");
        } else if (a % 4 != 0) {

            System.out.println("This is not a Leap Year");
        } else {
            System.out.println("Find the Leap Year");
        }
    }
}
