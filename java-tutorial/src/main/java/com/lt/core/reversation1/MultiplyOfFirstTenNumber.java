package main.java.com.lt.core.reversation1;

public class MultiplyOfFirstTenNumber {
    public static void main (String... arg){
        int first = 1, count = 1;
        while(count <= 10){
            first = first * count;
            count = count + 1;
        }
        System.out.println(first);
    }

}
