package main.java.com.lt.core.questions;

/**
 * Created by Lhotse Team on 2/25/2019.
 */
public class EqualIgnoreCase {
    public static void main (String... arg){
        String x = "ankur";
        String y = "ANkur";
        boolean a = x.equalsIgnoreCase(y);
        System.out.println(a);
    }
}
