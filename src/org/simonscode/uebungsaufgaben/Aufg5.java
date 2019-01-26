package org.simonscode.uebungsaufgaben;

public class Aufg5 {
    static int b = 1;
    int a;

    Aufg5() {
        a = 3;
    }

    Aufg5(int n) {
        b = n;
    } // Achtung! b, nicht a

    static void s(Aufg5 x, int b) {
        x.a += 4;
        b += 4;
    }

    public static void main(String[] args) {
        Aufg5 o = new Aufg5();
        Aufg5 x = new Aufg5(5);
        int n = 6;
        s(o, b);
        // a)
        System.out.println("a) " + o.a);
        // b)
        System.out.println("b) " + b);
        b = 7;
        o.m(n);
        x.m(n);
        // c)
        System.out.print("c) ");
        System.out.println(100 * x.a + 10 * b + n);
    }

    void m(int n) {
        a++;
        b++;
        n++;
    }
}