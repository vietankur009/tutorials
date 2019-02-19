package main.java.com.lt.core.questions;

/**
 * Created by Lhotse Team on 2/15/2019.
 */
public class Grade {
    public static void main(String... arg){
        double a = 33.5;
        if(a>=90){
            System.out.println("Grade A");
        }
        else if (a>=70 && a<=89){
            System.out.println("Grade B");
        }
        else if (a>=60 && a<=69){
            System.out.println("Grade C");
        }
        else if (a>=50 && a<=59){
            System.out.println("Grade E");
        }
        else if (a<=50){
            System.out.println("Grade F");
        }else {
            System.out.println("Failed do again");
        }
    }
}

