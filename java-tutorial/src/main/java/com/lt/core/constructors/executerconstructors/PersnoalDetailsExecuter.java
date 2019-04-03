package main.java.com.lt.core.constructors.executerconstructors;


import main.java.com.lt.core.constructors.PersnoalDetails;

public class PersnoalDetailsExecuter {
    public static void main (String... arg){
        PersnoalDetails ankit = new PersnoalDetails("Ankit" , "Dhampur" , 1234567891);
        System.out.println(ankit.getName());
        System.out.println(ankit.getAddress());
        System.out.println(ankit.getAddharNumber());
    }
}
