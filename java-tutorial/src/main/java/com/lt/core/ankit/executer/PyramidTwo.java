package main.java.com.lt.core.ankit.executer;

public class PyramidTwo {
    public static void main (String... arg){
        for (int r = 0; r <= 3; r = r + 1){
            for (int c = 0; c <= r; c = c + 1){
                System.out.print("1");
            }
            System.out.println("");
        }
    }
}