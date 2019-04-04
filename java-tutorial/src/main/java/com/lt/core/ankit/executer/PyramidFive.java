package main.java.com.lt.core.ankit.executer;

public class PyramidFive {
    public static void main (String... arg){
        for (int r = 5; r >= 1; r = r - 1){
            for (int c = 1 ; c <= r; c = c + 1){
                System.out.print(c);
            }
            System.out.println("");
        }
    }

}
