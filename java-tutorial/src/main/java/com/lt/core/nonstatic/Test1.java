package com.lt.core.nonstatic;

import com.lt.core.Maths1;
import com.lt.core.Maths9;
import com.lt.core.Retangle;
import com.lt.core.area.Table;
import com.lt.core.maths.Maths6;
import com.lt.core.objects.*;

public class Test1 {
    public static void main(String... arg){

        System.out.println("==========================Starting for Creating Non Static Methord====================================");

        System.out.println("==========================Same Class Object======================================");
        Test1 test1 = new Test1();
        boolean x = test1.circal (5);
        System.out.println(x);
        System.out.println("==========================Same Class Object======================================");

        boolean y= Cubide.formula(5,6,8);
        System.out.println(y);

        Object1 object1 = new Object1();
        object1.sayhello("Ankit");

        Test2 test2 = new Test2();
        int o = test2.formula(2,5,7);
        System.out.println(o);

        int t = Maths1.formula(7,6);
        System.out.println(t);

        TestNew testNew = new TestNew();
        int c = testNew.addnumber(5,4);
        System.out.println(c);

        Test3 test3 = new Test3();
        double w = test3.simpleInterest(5,5,5);
        System.out.println(w);

        Test3 math = new Test3();
        double q = math.cube(5.9,2.5,5.5);
        System.out.println(q);

        Test3 maths = new Test3();
        double r = maths.valueofcube(4.5,8.2,9.5);
        System.out.println(r);

        double l = Maths9.paiNumber(5,7.5);
        System.out.println(l);

        int v = Maths6.twosqureNo(5,6);
        System.out.println(v);

        boolean i = Object2.formula(5,7);
        System.out.println(i);

        boolean z = Square.formula(5);
        System.out.println(z);

        int u = Retangle.Retangle(5,8);
        System.out.println(u);

        Table.table(2);

        boolean p = Object4.formula(5,5,7);
        System.out.println(p);
    }
    public boolean circal(double r) {
        double a = (22 / 7 * r * r);
        System.out.println(a);
        double b = (2 * 22 / 7 * r * 2);
        System.out.println(b);
        double c = (22 / 7 * r);
        System.out.println(c);
        return (a > b);
    }
}
