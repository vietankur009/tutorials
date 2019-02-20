package main.java.com.lt.core.questions;


public class OddNumber {
    public static void main(String... arg) {

        oddNumber();
    }

    public static void oddNumber() {
        double u = 9.5;
        if (u % 2 == 0) {
            System.out.println("Given No is Even");
        } else {
            System.out.println("Given no is odd");
        }
    }
}
