package main.java.com.lt.core.looping;

public class WhilePyramidThree {
    public static void main (String... arg){
        int r = 1;
        while(r <= 5){
            int c = 5;
            while (c >= r){
                System.out.print(" ");
                c = c - 1;
            }
            int s = 1;
            while (s <= r){
                System.out.print(r);
                System.out.print(" ");
                s = s + 1;
            }
            r = r + 1;
            System.out.println(" ");
        }
    }
}
