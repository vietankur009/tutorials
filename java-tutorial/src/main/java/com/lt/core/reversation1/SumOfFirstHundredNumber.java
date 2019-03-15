package main.java.com.lt.core.reversation1;

public class SumOfFirstHundredNumber {
    public static void main(String... arg){
        int sum = 0, count = 1;
        while(count <= 100){
            sum = sum + count;
            count = count + 1;
        }
        System.out.println(sum);
    }
}
