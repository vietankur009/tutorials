package main.java.com.lt.core.LodingAndOverloding;

public class PyramidWhileOne {
    public static void main(String... arg) {
        System.out.println("Ankit");
        int r = 5;
        while (r >= 1) {
            int c = 1;
            while (c <= r) {
                System.out.print(c);
                c = c + 1;

            }
            r = r - 1;
            System.out.println(" ");

        }
    }
}
