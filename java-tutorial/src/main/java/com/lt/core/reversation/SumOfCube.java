package main.java.com.lt.core.reversation;

public class SumOfCube {
    public static void main(String... arg){
        int sum = 0;
        for(int count = 2; count <= 7; count = count + 1){
           sum  += count * count * count;
        }
        System.out.println(sum);
    }
}
