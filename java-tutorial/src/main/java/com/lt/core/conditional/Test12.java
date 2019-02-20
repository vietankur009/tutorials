package main.java.com.lt.core.conditional;

public class Test12 {
    public static void main(String... arg){
        int x = 12;
        evenOrOddNumber(x);
    }
    public static void evenOrOddNumber(int a){
        int c = (a%2);
        if (c==0){
            System.out.println("given no is even");
        }else{
            System.out.println("given no is odd");
        }
    }
}
