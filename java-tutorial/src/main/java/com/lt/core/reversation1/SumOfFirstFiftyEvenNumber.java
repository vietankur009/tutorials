package main.java.com.lt.core.reversation1;

public class SumOfFirstFiftyEvenNumber {
    public static void main (String... arg){
        int evenNumber = 0, sum = 0;
        while(evenNumber <= 50){
            if(evenNumber % 2 == 0){
                sum = sum + evenNumber;
            }
            evenNumber = evenNumber +1;
        }
        System.out.println(sum);
    }
}
