package main.java.com.lt.core.LodingAndOverloding;

public class PyraqmidWhile {
    public static void main(String... arg){
        int a = 1;
        while (a<=5){
            int j = 1;
            while (j<=a){
                System.out.print(j);
                j=j+1;
            }
            a=a+1;
            System.out.println(" ");
        }

    }
}
