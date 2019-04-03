package main.java.com.lt.core.conditional;

import main.java.com.lt.core.constructors.Person;

public class Test12 {
    public static void main(String... arg){
        Person ankit = new Person("ankit",32,"Dhampur");
        System.out.println(ankit.getAddress());
        System.out.println(ankit.getName());
        System.out.println(ankit.getAge());
    }

}
