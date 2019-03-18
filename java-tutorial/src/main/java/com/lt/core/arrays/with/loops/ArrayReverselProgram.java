package main.java.com.lt.core.arrays.with.loops;

public class ArrayReverselProgram {
    public static void main(String... arg){
        String x = "Akit Is Learning Java";
        String [] y = x.split(" ");
        for (int i = y.length-1; i >= 0; i = i - 1){
            System.out.println(y[i]);
        }
    }
}
