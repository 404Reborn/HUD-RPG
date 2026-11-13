package src.ejercicios;

import java.util.Scanner;

public class Consola {

    private static Scanner sc = new Scanner(System.in);

    public static int leeInt(String mensaje) {
        System.out.print(mensaje);
        return sc.nextInt();
    }

    public static float leeFloat(String mensaje) {
        System.out.print(mensaje);
        return sc.nextFloat();
    }

    public static double leeDouble(String mensaje) {
        System.out.print(mensaje);
        return sc.nextDouble();
    }

    public static char leeChar(String mensaje) {
        System.out.print(mensaje);
        return sc.next().charAt(0);
    }

    public static String leeString(String mensaje) {
        System.out.print(mensaje);
        return sc.next();
    }

    public static String leeLinea(String mensaje) {
        System.out.print(mensaje);
        sc.nextLine();
        return sc.nextLine();
    }
}