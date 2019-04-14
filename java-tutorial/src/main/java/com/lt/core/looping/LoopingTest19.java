package com.lt.core.looping;

public class LoopingTest19 {
    public static void main(String... arg){
        pyramid();
        for(int x = 1; x<=5; x=x+1){
            for(int j = 1; j<=x;j=j+1){
                System.out.print(" ");
            }
            for(int a = 5; a>=x; a=a-1){
                System.out.print(a);
            }
            System.out.println(" ");
        }
    }
    public static void pyramid (){
        int y = 1;
        while (y<=5){
            int d = 1;
            while (d <= y){
                System.out.print(" ");
                d = d + 1;
            }
            int f = 5;
            while (f >= y){
                System.out.print(f);
                f = f-1;
            }
            y = y + 1;
            System.out.println(" ");
        }
    }
}
