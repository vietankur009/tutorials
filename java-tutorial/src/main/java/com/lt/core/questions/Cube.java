package main.java.com.lt.core.questions;

public class Cube {
    public static void main(String... arg){
        Cube c = new Cube();
        c.cube(5);
    }
    public void cube (int a){
        a = (a*a*a);
        System.out.println(a);
    }
}
