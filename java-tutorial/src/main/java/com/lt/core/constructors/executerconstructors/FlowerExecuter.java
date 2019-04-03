package main.java.com.lt.core.constructors.executerconstructors;

import main.java.com.lt.core.constructors.Flower;

public class FlowerExecuter {
    public static void main (String... arg){
        Flower rose = new Flower("Rose", "Red");
        System.out.println(rose.getName());
        System.out.println(rose.getColor());

    }
}
