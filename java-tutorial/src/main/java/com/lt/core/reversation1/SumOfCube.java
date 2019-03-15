package main.java.com.lt.core.reversation1;

public class SumOfCube {
    public static void main(String... arg){
        int a = 2,sum = 0;
        while (a <= 7){
            sum = sum + a*a*a;
            System.out.println(sum);
            a = a+1;
        }
    }
}
