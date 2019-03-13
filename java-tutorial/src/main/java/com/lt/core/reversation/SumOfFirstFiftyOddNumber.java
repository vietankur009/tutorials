package main.java.com.lt.core.reversation;

public class SumOfFirstFiftyOddNumber {
    public static void main(String... arg){
        int oddNumber = 0;
        for (int count = 0; count <= 50; count = count + 1){
            if (count % 2 != 0){
                oddNumber = count + oddNumber;
                System.out.println(oddNumber);
            }else {
                System.out.println("Sum of odd Number");
            }
        }
    }
}
