package main.java.com.lt.core.reversation;

public class SumOfFirstFiftyEvenNumber {
    public static void main(String... arg){
        int evenNumber = 0;
        for (int count = 1 ; count <= 50; count = count + 1){
            if (count % 2 == 0){
                evenNumber = count + evenNumber;
                System.out.println(evenNumber);
            }
        }
    }
}
