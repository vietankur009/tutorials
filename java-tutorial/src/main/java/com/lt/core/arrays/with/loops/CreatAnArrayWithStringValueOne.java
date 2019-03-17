package main.java.com.lt.core.arrays.with.loops;

public class CreatAnArrayWithStringValueOne {
    public static void main(String... arg){
        String [] x = new String[5];
        for(int y = 0; y < x.length; y = y + 1){
            x [y] = "Anki chauhan , Ankur Chauhan";
        }
        for (int i = 0; i < x.length; i = i + 1){
            System.out.println(x[i]);
        }
    }
}
