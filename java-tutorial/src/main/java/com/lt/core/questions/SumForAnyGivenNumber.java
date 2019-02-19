package main.java.com.lt.core.questions;

/**
 * Created by Lhotse Team on 12/27/2018.
 */
public class SumForAnyGivenNumber {
    public static void main(String... arg){
        int b = add();
        System.out.println(b);
        Pyramid.pyramid();
        Pyramid.pyramid2();
        Pyramid.pyramid3();
    }
    public static int add (){
        int b = 0;
        for(int a = 1; a<=10; a = a+1){
            b = b+a;
        }
        return b;
    }

}
