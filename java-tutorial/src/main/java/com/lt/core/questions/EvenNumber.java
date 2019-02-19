package main.java.com.lt.core.questions;


public class EvenNumber {
    public static void main (String... arg){
        EvenNumber c = new EvenNumber();
        c.evenNumber();

    }
    public void evenNumber(){
        int u = 26;
        if(u%2==0){
            System.out.println("Given No is Even");
        }else {
            System.out.println("Given No is Odd");
        }
    }
}
