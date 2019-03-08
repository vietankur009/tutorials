package main.java.com.lt.core.table;

public class Table {
    public static void main(String... arg){
        table(5);
    }
    public static void table(int a){
        for(int i = 1; i<=10; i = i +1){
            System.out.println(i*a);
        }
    }
}
