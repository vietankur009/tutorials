package main.java.com.lt.core.reversation1;

public class SumOfFirstFiftyOddNumber {
    public static void main (String... arg){
        int oddNumber = 0, sum = 0;
        while(oddNumber <= 50){
            if(oddNumber % 2 != 0){
                sum = sum + oddNumber;
            }
            oddNumber = oddNumber +1;
        }
        System.out.println(sum);
    }
}
