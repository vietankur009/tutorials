package com.lt.core.objects;

public class Text1 {
    public static void main(String... arg){
        Text1 text1 = new Text1();
        int x = text1.add(4,5);
        System.out.println(x);

        AreaCircal areaCircal = new AreaCircal();
        areaCircal.sayHello("Ankit");

        boolean t = AreaCircal.circal(5);
        System.out.println(t);
    }

    public int add(int i, int j){

        return i+j;
    }
}
