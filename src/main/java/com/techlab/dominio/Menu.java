package com.techlab.dominio;

import com.techlab.utilidades.Utilidades;

import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void menu() {
        int opcion;
        do {
            System.out.println();
            System.out.println("=============================================");
            System.out.println("---- SISTEMA DE GESTIÓN - TECHLAB ----");
            System.out.println("=============================================");
            System.out.println("1) Agregar producto");
            System.out.println("2) Listar productos");
            System.out.println("3) Buscar/Actualizar producto");
            System.out.println("4) Eliminar producto");
            System.out.println("5) Crear pedido");
            System.out.println("6) Listar pedidos");
            System.out.println("0) Salir");

            opcion = Utilidades.leerEntero(sc,"Ingresar una opción; ");

            switch (opcion) {
                case 1: Servicios.agregarProducto();
                break;
                case 2: Servicios.listarProductos();
                break;
                case 3: Servicios.buscarProductoPorId();
                break;
                case 4: Servicios.eliminarProductoPorId();
                break;
                case 5: Servicios.crearPedido();
                break;
                case 6: Servicios.listarPedidos();
                break;
                case 0: System.out.println("Saliendo... ✅");
                break;
                default: System.out.println("Opción invalida. ❌");
            }

        } while (opcion != 0);
    }
}
