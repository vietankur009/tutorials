package main.java.com.lt.core.questions;

public class Grade {
    public static void main(String... arg) {
        grade(87);

    }
    public static void grade(double x){
        if (x >= 90) {
            System.out.println("Grade A");
        } else if (x >= 70 && x <= 89) {
            System.out.println("Grade B");
        } else if (x >= 60 && x <= 69) {
            System.out.println("Grade C");
        } else if (x >= 50 && x <= 59) {
            System.out.println("Grade E");
        } else if (x <= 50) {
            System.out.println("Grade F");
        } else {
            System.out.println("Failed do again");
        }
    }
}

