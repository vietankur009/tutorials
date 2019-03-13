package main.java.com.lt.core.reversation;

public class SumOfFirstHundredNumber {
    public static void main(String... arg){
        int sum = 0;
        for (int count = 0; count <= 100; count = count + 1){
            sum = sum + count;

        }
        System.out.println(sum);
    }
}
