package main.java.com.lt.core.collecation;

public class LoopingThree {
    public static void main(String... arg){
        int r = 1;
        while (r<=5){
            int c = 1;
            while (c<=r){
                System.out.print(r);
                c = c + 1;
            }
            r = r + 1;
            System.out.println(" ");
        }
    }
}
