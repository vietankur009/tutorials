package main.java.com.lt.core.questions;


public class EvenNumberWithNonStaticMethod {

    public static void main (String... arg){

        EvenNumberWithNonStaticMethod c = new EvenNumberWithNonStaticMethod();

        c.evenNumber();

    }
    public void evenNumber(){
        int u = 26;

        if(u%2==0){

            System.out.println("No is even");
        }
    }
}
