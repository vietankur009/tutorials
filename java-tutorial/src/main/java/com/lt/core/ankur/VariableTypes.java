package main.java.com.lt.core.ankur;


public class VariableTypes {

    private int j = 20;
    private static int k = 5;
    /*
        comments section.
     */
    public static void main(String... args){
        int k = 30;
        System.out.println(k);
        VariableTypes vt = new VariableTypes();
        vt.add();
        vt.minus();
    }

    public void add(){
        System.out.println(k);
        j = j+10;
        System.out.println(j);
    }

    public void minus(){
        j = j - 5;
        System.out.println(j);
    }
}
