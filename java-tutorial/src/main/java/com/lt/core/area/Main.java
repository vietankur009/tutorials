package com.lt.core;

import com.lt.core.*;
import com.lt.core.AreaOfCube;
import com.lt.core.Cuabing;
import com.lt.core.Mainess;
import com.lt.core.Maths;
import com.lt.core.Maths1;
import com.lt.core.Maths10;
import com.lt.core.Maths3;
import com.lt.core.Maths5;
import com.lt.core.Retangle;
import com.lt.core.maths.Maths2;
import com.lt.core.maths.Maths4;

public class Main {

    public static void main(String... arg){
        int x=AreaOfCube.AreaOfCube(5,5,5);
        System.out.println(x);

        int sum =Maths.addNumbers(10,20);
        System.out.println(sum);

        int mainess =Mainess.mainess(10,20);
        System.out.println (mainess);

        int t= Cuabing.cube(5);
        System.out.println(t);

        int p= Maths1.formula(6,7);
        System.out.println(p);

        int a= Maths2.cube (5,5);
        System.out.println(a);

        int g=Maths3.squreNumber(5,5);
        System.out.println(g);

        int h= Maths4.cube(5,5,5);
        System.out.println(h);

        int j= Maths5.squre(5,5);
        System.out.println(j);

        double l =Maths10.squrePaiNumber(7,5);
        System.out.println(l);

        int e= Retangle.Retangle(2,4);
        System.out.println(e);


    }
}
