package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A52 {

    public static void run() {
        Eule eule = new Eule();
    }

    static class Vogel {
        Vogel() {
            System.out.println("Vogel");
        }
    }

    static class Eule extends Vogel {
        Eule() {
            System.out.println("Eule");
//            super(); (fehlerhafte Zeile, super muss das erste im Konstruktor sein)
        }
    }
}
