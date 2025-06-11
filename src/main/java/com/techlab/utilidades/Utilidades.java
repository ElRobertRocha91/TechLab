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
}
