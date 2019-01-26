package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A72 {
    public static void run() {
        O x = new U();
        x.oo();
        x.uu();
        x.hh();
    }

    static class O {
        int a = 1;

        void oo() {
            System.out.println("O");
        }

        void uu() {
            oo();
        }

        void hh() {
            System.out.println(a);
        }
    }

    static class U extends O {
        int a = 2;

        @Override
        public void oo() {
            System.out.println("U");
        }
    }
}
