package main.java.com.lt.core.ankit.executer;

public class PyramidThree {
    public static void main(String... arg){
        for (int r = 1; r <= 4; r = r + 1){
            for (int c = 1; c <= r; c = c + 1){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
