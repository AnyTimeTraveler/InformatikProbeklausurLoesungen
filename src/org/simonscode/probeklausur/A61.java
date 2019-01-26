package org.simonscode.probeklausur;

import java.util.Arrays;

@SuppressWarnings("ALL")
public class A61 {
    static int[][] a = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
    };

    public static void run() {
//        a[7] = 10; (fehlerhaft, da array mit int ersetzt werden soll)
        printArray(a);

        System.out.println("\na[2][3] = a[3][2];");
        a[2][3] = a[3][2];
        printArray(a);

//        10 = a[3][2]; (fehlerhaft, da 10 eine konstante ist und nicht zugewiesen werden kann)

        System.out.println("\na[1][2] = a[2][1];");
        a[1][2] = a[2][1];
        printArray(a);
    }

    private static void printArray(int[][] data) {
        for (int[] line : data) {
            System.out.println(Arrays.toString(line));
        }
    }
}
