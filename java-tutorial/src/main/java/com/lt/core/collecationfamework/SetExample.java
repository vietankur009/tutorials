package main.java.com.lt.core.collecationfamework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

    public static void main(String... arg){
        HashSet <String> list = new HashSet<>();
        list.add("Shivam");
        list.add("Shivam");
        list.add("Shivam");
        list.add("Shivam");
        list.add("Shivam");
        list.add("Ankit");
        list.add("Ankit");
        list.add("Ankit");
        list.add("Ankit");
        list.add("Ankit");
        list.add("Ankur");


        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String element : list){
            element = element+" chauhan";
            System.out.println(element);
        }

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);
        intList.add(9);
        int sum = 0;
        for(Integer element : intList){
            sum  = sum + element;
            System.out.println(element);
        }

        System.out.println("Sum = "+sum);




    }
}
