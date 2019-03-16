package main.java.com.lt.core.arrays.with.loops;

public class CreatAnArrayWithDoubleValueOne {
    public static void main(String... arg){
        double [] x = new double[5];
        for(int y = 0; y < x.length; y = y + 1){
            x [y] = y * 10 + 1;
        }
        for (int i = 0; i < x.length; i = i + 1){
            System.out.println(x[i]);
        }
    }
}
