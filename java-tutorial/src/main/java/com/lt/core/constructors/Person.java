package main.java.com.lt.core.constructors;

public class Person {


    private String name;
    private int age;
    private String address;

    // Default Constructor
    public Person() {
       // System.out.println("testing constructor");
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}
