package main.java.com.lt.core.constructors;

public class Flower {
    private  String name;
    private  String color;

    public Flower(){

    }

    public Flower(String name, String color){
       this.name = name;
       this.color = color;

    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
