package main.java.com.lt.core.reversation1;

public class CubeOfEveryNumberTwoToTwenty {
    public static void main(String... arg){
        int  count = 2 ;
        while(count <= 20) {
            System.out.println(count * count * count);
            count = count + 1;
        }
    }
}
