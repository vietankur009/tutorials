package main.java.com.lt.core.questions;

public class Pyramid {


    public static void main(String arg[]) {

        System.out.println("Ankur Chauhan");

        pyramid();
        int a = SimpleInterest.cube(5);
        System.out.println(a);
        pyramid2();
        pyramid3();
        array();
        int c = array1();
        System.out.println(c);
        table();
        table1();
    }

    public static void pyramid() {
        for (int x = 1; x <= 5; x = x + 1) {
            for (int y = 1; y <= x; y = y + 1) {
                System.out.print(y);
            }
            System.out.println(" ");
        }
    }

    public static void pyramid2() {
        for (int a = 5; a >= 1; a = a - 1) {
            for (int y = 1; y >= a; y = y - 1) {
                System.out.print("");
            }
            for (int x = a; x >= 1; x = x - 1) {
                System.out.print(x);
            }
            System.out.println(" ");
        }
    }

    public static void pyramid3() {
        int x = 5;
        while (x >= 1) {
            int j = x;
            while (j >= 1) {
                System.out.print(j);
                j = j - 1;
            }
            System.out.println("");
            x = x - 1;
        }
    }

    public static void array() {
        int[] i = new int[10];
        for (int a = 0; a <= i.length - 1; a = a + 1) {
            i[a] = a * 15;
        }
        for (int j = 0; j <= i.length - 1; j = j + 1) {
            System.out.println(i[j]);
        }
    }

    public static int array1() {
        int[] i = new int[10];
        for (int a = 0; a <= i.length - 1; a = a + 1) {
            i[a] = a * 15;
        }
        for (int j = 0; j <= i.length - 1; j = j + 1) {
            System.out.println(i[j]);
        }
        int c = 0;
        for (int k = 0; k <= i.length - 1; k = k + 1) {
            c = i[k] + c;
        }
        return (c);
    }

    public static void table() {
        int a = 1;
        while (a <= 10) {
            int b = 1;
            while (b <= 10) {
                System.out.print(a * b + "\t");
                b = b + 1;
            }
            System.out.println("");
            a = a + 1;
        }
        System.out.println("========================================");
    }

    public static void table1() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + "  *  " + j + "  =  " + i * j);
                j = j + 1;
            }
            System.out.println("================");
            i = i + 1;
        }
    }
}