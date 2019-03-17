package main.java.com.lt.core.arrays.with.loops;

public class CreatAnArrayWithFloatValueOne {
    public static void main(String... arg){
        float [] y = new float[5];
        for (int x = 0; x < y.length; x = x + 1){
            y [x] = x * 11 + 1;
        }
        for (int i = 0; i < y.length; i = i + 1){
            System.out.println(y[i]);
        }
    }
}
