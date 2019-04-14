package main.java.com.lt.core.collecationfamework;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Lhotse Team on 4/9/2019.
 */
public class MapExample {
    public static void main (String... arg){
        HashMap<String, String> map = new HashMap<>();

        map.put("Name" , "Ankit");
        map.put("Add" , "Dhampur");
        map.put("Age", "32");

        String x = map.get("Name");
        System.out.println(x);


        ArrayList <HashMap<String , String>> a = new ArrayList<>();

        for (HashMap<String , String> t : a){
            System.out.println(t.get("Name"));
            System.out.println(t.get("Add"));
            System.out.println(t.get("Age"));
        }

    }
}
