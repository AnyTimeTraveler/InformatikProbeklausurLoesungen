package org.simonscode.probeklausur;

@SuppressWarnings("ALL")
public class A9 {
    public static void run() {
        Linie x = new Linie(new Punkt(0, 0), new Punkt(0, 0));
    }

    public static class Punkt {
        private int x;
        private int y;

        Punkt(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Punkt) {
                Punkt other = (Punkt) obj;
                return this.x == other.x && this.y == other.y;
            }
            return false;
        }
    }

    public static class Linie {
        private Punkt p1;
        private Punkt p2;

        Linie(Punkt p1, Punkt p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        public static Linie longer(Linie a, Linie b) {
            if (a.length() > b.length()) {
                return a;
            } else {
                return b;
            }
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Linie) {
                Linie other = (Linie) obj;

                return p1.equals(other.p1) && p2.equals(other.p2);
            }
            return false;
        }

        double length() {
            int deltaX = p2.x - p1.x;
            int deltaY = p2.y - p1.y;
            return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        }

        public boolean isLongerThan(Linie other) {
            return this.length() > other.length();
        }
    }
}
