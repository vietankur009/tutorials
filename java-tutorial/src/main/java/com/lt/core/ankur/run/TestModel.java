package main.java.com.lt.core.ankur.run;

import main.java.com.lt.core.ankur.model.Records;

/**
 * Created by Lhotse Team on 4/1/2019.
 */
public class TestModel {
    public static void main(String... arg){
        Records record = new Records();
        record.setName("Ankur".concat(" Chauhan").replace("Ankur","Nav"));
        record.setAge(30);
        record.setAddress("Dhampur");
        record.setGender("Male");
        record.setSchool("Radha");

        System.out.println(record.getName() + ", " + record.getAddress() + ", " + record.getAge() + ", " + record.getGender() + ", " + record.getSchool());

        record.setName("Navneet");
        System.out.println(record.getName() + ", " + record.getAddress() + ", " + record.getAge() + ", " + record.getGender() + ", " + record.getSchool());
        Records record1 = new Records();
        record1.setName("Ankit");
        record1.setAge(28);
        record1.setAddress("Binor");
        record1.setGender("Male");
        record1.setSchool("SSSSS");
        System.out.println(record1.getName() + ", " + record1.getAddress() + ", " + record1.getAge() + ", " + record1.getGender()+", "+record1.getSchool());

    }
}
