package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A33 {

    static int a;

    private static void run() {
        int a = getA();
        System.out.println(a++);
    }

    static int getA() {
        return a;
    }
}
