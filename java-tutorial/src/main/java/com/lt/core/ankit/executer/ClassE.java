package main.java.com.lt.core.ankit.executer;

public class ClassE extends ClassD {

    public  void table (){
        int a = 2;
        for (int i = 1; i <= 10; i = i + 1){
            System.out.println(i*a);
        }
        System.out.println ("************");
    }

    public static void main (String... arg){

        ClassE e = new ClassE();
        e.table();
        e.deived();

    }

}
