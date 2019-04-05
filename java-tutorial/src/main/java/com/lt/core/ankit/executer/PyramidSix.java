package main.java.com.lt.core.ankit.executer;


public class PyramidSix {
    public static void main(String... arg){
        int i = 1;
        for (int r = 5; r >= 1; r = r - 1){
            for (int c = 1; c <= r; c = c + 1){
                System.out.print(i);
                i = i - 1 ;
            }
            System.out.println("");
        }
    }
}
