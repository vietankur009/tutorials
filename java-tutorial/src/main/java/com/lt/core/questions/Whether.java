package main.java.com.lt.core.questions;

public class Whether {
    public static void main(String... arg){
        double a = 43.5;
        if (a<32){
            System.out.println("SNOW");
        }
        else if(a>45){
            System.out.println("SUNNY");
        }
        else if (a>=33 && a<=44){
            System.out.println("RAIN");
        }else {
            System.out.println("Today is Rain");
        }
    }
}
