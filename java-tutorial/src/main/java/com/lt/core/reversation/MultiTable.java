package main.java.com.lt.core.reversation;

public class MultiTable {
    public static void main (String... arg){
        for(int a = 1; a<=10; a=a+1){
            System.out.println("TABLE FOR:" + a) ;

            for (int b = 1; b<=10; b=b+1){
                System.out.println(a + " * " + b + " = " + a * +b);
            }
            System.out.println("----------------------------------------------------");
        }
    }
}
