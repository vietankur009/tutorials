package main.java.com.lt.core.constructors;

public class Animal {
    private String name;
    private String type;

    public Animal(){

    }


    public Animal(String name, String type){
        this.name = name;
        this.type = type;

    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
