package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A51 {

    static class A {
        A(String a) {
        }

        A() {
        }
    }

    static class B extends A {
        B() {
        }

        B(String s) {
            super(s);
        }
//        B(int s) {super(s);} (fehlerhafte Zeile)

        void test() {
            // HIER CODE //
        }
    }
}
