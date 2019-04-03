package main.java.com.lt.core.constructors.executerconstructors;


import main.java.com.lt.core.constructors.LapTopDetails;

public class LapTopDetailsExecuter {
    public static void main(String... arg){
        LapTopDetails hp = new LapTopDetails("HP Laptop ","Coar I5",45000);
        System.out.println(hp.getBrand());
        System.out.println(hp.getType());
        System.out.println(hp.getPrice());
    }
}
