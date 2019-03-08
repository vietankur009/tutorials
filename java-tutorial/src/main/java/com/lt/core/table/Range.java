package main.java.com.lt.core.table;

public class Range {
    public static void main(String... arg){
        for(int range = 1; range <= 100; range = range+1){

            if (range%2==0){
                System.out.println(range +" " + "Number is even");
            }
            if (range%2!=0){
                System.out.println(range +" " + "no is odd");
            }
        }
    }
}
