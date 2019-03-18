package main.java.com.lt.core.arrays.with.loops;

public class ArrayReverselWithCharractorWise {
    public static void main(String... arg){
        String x = "DHAMPUR IS MY HOME TOWN";
        String [] k = x.split("");
        for(int c = k.length-1; c >= 0; c = c - 1){
            System.out.print(k[c]);
        }
    }
}
