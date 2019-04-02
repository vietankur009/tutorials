package main.java.com.lt.core.ankit.executer;

import main.java.com.lt.core.ankit.pojo.Animals;

public class AnimalExeutor {
    public static void main(String... arg){
        Animals tiger = new Animals();
        tiger.setName("Tiger");
        tiger.setAge(2);
        tiger.setAddress("Dhampur");
        tiger.setLegs(4);
        System.out.println(tiger.getName() + ", " + tiger.getAddress() + ", " + tiger.getAge() + ", " + tiger.getLegs());


        Animals dog = new Animals();
        dog.setName("jully");
        dog.setAddress("Bijnor");
        dog.setAge(1);
        dog.setLegs(4);
        System.out.println(dog.getName()+ "," + dog.getAddress()+ ", " + dog.getAge()+ ", " + dog.getLegs());

    }
}
