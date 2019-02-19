package main.java.com.lt.core.questions;

public class DivisibleAndGreaterthan {
    public static void main(String... arg){
        int a = 30;
        if(a%3==0){
            System.out.println("No is divisible by 3");
        }
        else if(a%2==0){
            System.out.println("No is divisible by 2");
        }else {
            System.out.println("Thanks");
        }

        DivisibleAndGreaterthan f = new DivisibleAndGreaterthan();
        boolean k = f.greaterthan(10,5);
        System.out.println(k);

        DivisibleAndGreaterthan g = new DivisibleAndGreaterthan();
        boolean r = f.equal(5.5,4.5);
        System.out.println(r);
    }
    public static boolean greaterthan(int a, int b){

        return (a>b);
    }
    public static boolean equal(double a , double b) {
        return (a == b);
    }
}
