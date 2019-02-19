package main.java.com.lt.core.questions;

public class SimpleInterest {
    public static void main(String... arg) {
        int j = 10;
        int t = cube(j);
        System.out.println(t);
        double k = simpleInterest(5, 10, 15);
        System.out.println(k);
        int a = SumForAnyGivenNumber.add();
        System.out.println(a);
        table();

    }

    public static int cube(int b) {

        return (b * b * b);
    }

    public static double simpleInterest(int p, int r, int t) {

        return (p * r * t / 100);
    }
    public static void table(){
        int i= 1;
        while (i<=10){
            int j=1;
            while (j<=10){
                System.out.println(i +"  *  " + j + "  =  " + i * j);
                j=j+1;
            }
            System.out.println("================");
            i=i+1;
        }

    }
}
