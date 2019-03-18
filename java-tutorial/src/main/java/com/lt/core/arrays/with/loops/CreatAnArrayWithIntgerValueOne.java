package main.java.com.lt.core.arrays.with.loops;

public class CreatAnArrayWithIntgerValueOne {
    public static void main (String... arg){
        int [] x = new int[5];
        for (int y = 0; y < x.length; y = y + 1){
            x [y] = y * 12 + 1;
        }
        for (int i = 0; i < x.length; i = i + 1){
            System.out.println(x[i]);
        }
    }
}
