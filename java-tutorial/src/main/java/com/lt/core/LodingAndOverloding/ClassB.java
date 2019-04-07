package main.java.com.lt.core.LodingAndOverloding;

public class ClassB extends ClassA{

    public void pyramid (){
        for (int r = 1; r <= 5; r = r + 1){

            for (int c = 1; c <= r; c = c + 1){

                System.out.print(c);
            }
            System.out.println();
        }

    }
}
