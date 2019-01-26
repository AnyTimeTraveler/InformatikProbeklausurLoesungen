package org.simonscode.probeklausur;

import java.lang.reflect.InvocationTargetException;

public class Runner {
    private static Class<?>[] classes = new Class[]{
            A11.class,
            A12.class,
            A21.class,
            A31.class,
            A33.class,
            A41.class,
//            A51.class,
            A52.class,
            A61.class,
//            A62.class,
//            A63.class,
            A72.class,
            A8.class,
            A9.class
    };

    public static void main(String[] args) {
        for (Class<?> clazz : classes) {
            String name = clazz.getSimpleName();
            System.out.println(name.charAt(1) + (name.length() > 2 ? "." + name.charAt(2) : "") + ":");
            try {
                clazz.getMethod("run").invoke(null);
            } catch (InvocationTargetException e) {
                System.out.printf("Error in Zeile %s:%n  %s : %s%n",
                        e.getTargetException().getStackTrace()[0].getLineNumber(),
                        e.getTargetException().getClass(),
                        e.getTargetException().getMessage());
            } catch (Exception e) {
                System.out.println("Unbekannter Fehler!");
                e.printStackTrace(System.out);
            }
            System.out.println();
            System.out.println();
        }
    }
}
