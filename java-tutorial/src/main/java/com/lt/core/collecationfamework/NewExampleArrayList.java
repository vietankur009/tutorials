package main.java.com.lt.core.collecationfamework;

import java.util.ArrayList;

/**
 * Created by Lhotse Team on 4/8/2019.
 */
public class NewExampleArrayList {
    public static void main (String... arg){
        ArrayList <String> list = new ArrayList<>();
        list.add ("Ankit");
        list.add ("Ankur");
        list.add ("Ankit");
        list.add ("Shivam");
        list.add ("Nav");
        list.add(1, "prashant");
        list.remove(1);

        for (String element : list){
            element = element + " Chauhan";
            System.out.println(element);
        }

        ArrayList <String> secondArrayList = new ArrayList<>();
        secondArrayList.add ("Priyanka");
        secondArrayList.add ("Hanshu");

        System.out.println(" ");

        list.addAll(secondArrayList);

        for (String element : list){
            element = element + " Chauhan";
            System.out.println(element);
        }

        System.out.println(list.contains("Ankit"));
        list.clear();

        System.out.println(list+ "After Clear" );


    }
}
