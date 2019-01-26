package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A31 {

    private static void run() {
        int x = 0;
        Klasse k = new Klasse();
        new Test().foo(x, k);
        System.out.println(x + " " + k.s);
    }

    private static class Klasse {
        public String s = "hoo";
    }

    private static class Test {

        public void foo(int i, Klasse k) {
            i = 5;
            k.s = "huu";
        }
    }
}
