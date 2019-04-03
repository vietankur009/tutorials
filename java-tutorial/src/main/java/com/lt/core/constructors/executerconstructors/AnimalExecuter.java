package main.java.com.lt.core.constructors.executerconstructors;

import main.java.com.lt.core.constructors.Animal;

public class AnimalExecuter {
    public static void main(String... arg){
        Animal lion = new Animal("Lion" , "Panthera leo");
        System.out.println(lion.getName());
        System.out.println(lion.getType());

    }
}
