package main.java.com.lt.core.reversation;

public class MultiplyOfFirstTenNumber {
    public static void main (String... arg){
        int first = 1;
        for (int count = 1; count <= 10; count = count + 1){
            first = count * first;
            System.out.println(first);
        }
    }
}
