package main.java.com.lt.core.ankit.executer;

public class ClassB extends ClassA {

    public void printName(){
        System.out.println("Ankit");
    }

    public static void main(String... arg){
        ClassB b = new ClassB();
        b.printHello();
        b.printName();


        ClassA a = new ClassA();
        a.printHello();
        a.printNew();
        b.printNew();
    }

}
