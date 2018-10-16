package com.lt.core.nonstatic;

public class TestNew {

    public static void main(String... arg){
        TestNew math = new TestNew();
        int c = math.addnumber(5,4);
        System.out.println(c);

    }
    public int addnumber(int a, int b){
        return (a+b);
    }
}
