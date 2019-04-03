package main.java.com.lt.core.constructors.executerconstructors;

import main.java.com.lt.core.constructors.Schools;

/**
 * Created by Lhotse Team on 4/3/2019.
 */
public class SchoolsExecuter {
    public static void main(String... arg){
        Schools priyanka = new Schools("Priyanka", "C.B.S.C bord Delhi", 4500);
        System.out.println(priyanka.getName());
        System.out.println(priyanka.getStandered());
        System.out.println(priyanka.getPapulation());
    }
}
