package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A8 {
    public static void run() {
//        Fahrzeug derRenner = new Fahrzeug();
        Fahrzeug blitz = new PKW();
        blitz.ichBin();
        PKW blitz2 = (PKW) blitz;
//        Cabrio p911 = new PKW();
        PKW vwc = new Cabrio();
//        vwc.superSport();
        Cabrio bmw = (Cabrio) new PKW();
    }

    static abstract class Fahrzeug {
        public abstract void ichBin();
    }

    static class PKW extends Fahrzeug {
        public void ichBin() {
            System.out.println("PKW");
        }
    }

    static class Cabrio extends PKW {
        public void ichBin() {
            System.out.println("Cabrio");
        }
    }
}
