package com.techlab.utilidades;

import java.util.Scanner;

public class Utilidades {
    public static int leerEntero(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        while (!sc.hasNextInt()){
            System.out.println("Debe ingresar un número. Vuelva a ingresar: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static String leerNombre(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        String name;
        while (true) {
            name = sc.next();
            if (name.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Debe ingresar solo letras. Vuelva a ingresar: ");
            }
        }
        return name;
    }
}
