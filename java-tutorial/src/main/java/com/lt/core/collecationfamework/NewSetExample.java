package main.java.com.lt.core.collecationfamework;

import java.util.HashSet;

public class NewSetExample {
    public static void main(String... arg){
        HashSet <String> list = new HashSet<>();
        list.add("Ankit");
        list.add("Ankur");
        list.add("Ankur");
        list.add("Ankur");
        list.add("Ankur");
        list.add("Navneet");
        list.add("Priyanka");
        list.add("hanshu");

        for(String element : list){
            System.out.println(element);
        }
    }
}
