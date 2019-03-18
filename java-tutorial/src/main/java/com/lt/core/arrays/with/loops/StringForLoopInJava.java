package main.java.com.lt.core.arrays.with.loops;

public class StringForLoopInJava {
    public static void main(String... arg){
        String x = "Ankit Is Learning Java";
        String [] y = x.split(" ");
        for (int i = 0; i < y.length; i = i +1){
            System.out.println(y[i]);
        }
    }
}
