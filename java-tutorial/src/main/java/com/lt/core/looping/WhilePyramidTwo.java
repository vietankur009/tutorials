package main.java.com.lt.core.looping;

/**
 * Created by Lhotse Team on 4/14/2019.
 */
public class WhilePyramidTwo {
    public static void main(String... arg){
        int a = 1;
        while (a <= 5){
            int b = a;
            int c = 1;
            while (c <= a){
                System.out.print(b+" ");
                b = b + 5 -c;
                System.out.print(" ");
                c = c + 1;
            }
            a = a+1;
            System.out.println(" ");
        }
    }
}
