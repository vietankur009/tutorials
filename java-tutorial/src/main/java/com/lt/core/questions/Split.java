package main.java.com.lt.core.questions;

public class Split {
    public static void main(String... arg) {
        String a = "ANKIT CHAUHAN IS LEARNING JAVA IN DHAMPUR";
        String[] y = a.split(" ");
        for (int j = 0; j < y.length; j = j + 1) {
            System.out.println(y[j]);
        }
    }
}
