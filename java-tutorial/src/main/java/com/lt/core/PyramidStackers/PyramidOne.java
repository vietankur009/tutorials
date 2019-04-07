package main.java.com.lt.core.PyramidStackers;

/**
 * Created by Lhotse Team on 4/7/2019.
 */
public class PyramidOne {
    public static void main(String... arg){

        int r = 0;

        while (r <= 3){
            int s = 3;
            while (s > r){
                System.out.print(" ");
                s = s - 1;
            }
            int c = 0;
            while (c<=r){
                System.out.print("*");
                c = c + 1;
            }
            r = r +1;
            System.out.println("");

        }
    }
}
