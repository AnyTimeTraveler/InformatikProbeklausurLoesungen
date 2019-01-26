package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A41 {

    private static void run() {
        B b = new B();
        b.b = 1;
        b.a = 2;
        b.zeige();
    }

    static class A {
        int a;
        int b;
    }

    static class B extends A {
        void zeige() {
            super.b = super.a + 1;
            System.out.println(super.b + " " + super.a);
        }
    }
}
