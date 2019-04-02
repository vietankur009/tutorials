package main.java.com.lt.core.ankit;

public class TestingVariables {
    static int i = 5;
    static int k = 15;


    public static void main(String... args){
        int k = 10;
        System.out.println(k);

        multiply();
        divied();

    }
    public static void multiply(){
        System.out.println(k);
        i = i * 10;
        System.out.println(i);
    }
    public static void divied(){
        i = i / 2;
        System.out.println(i);
    }
}
