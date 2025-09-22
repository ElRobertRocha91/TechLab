package com.techlab.dominio;

import com.techlab.clientes.Cliente;
import com.techlab.excepciones.PedidoException;
import com.techlab.excepciones.StockInsuficienteException;
import com.techlab.pedidos.Pedido;
import com.techlab.productos.Producto;
import com.techlab.utilidades.Utilidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicios {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Producto> productos = new ArrayList<>();
    private static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void agregarProducto() {
        sc.nextLine();
        System.out.println("=============================================");
        System.out.println("-------- AGREGAR PRODUCTOS - TECHLAB --------");
        System.out.println("=============================================");
        String nombre = Utilidades.leerNombre(sc, "Nombre del producto: ");
        int precio = Utilidades.leerEntero(sc,"Precio del producto: ");
        int stock = Utilidades.leerEntero(sc, "Ingresar stock: ");
        int newId = productos.size() + 1;
        productos.add(new Producto(newId, nombre, precio, stock));
        System.out.println("Producto agregado exitosamente. ✅");
    }

    public static void listarProductos() {
        System.out.println();
        System.out.println("=============================================");
        System.out.println("------------ PRODUCTOS - TECHLAB ------------");
        System.out.println("=============================================");
        for (Producto p: productos) {
            System.out.println(p);
        }
    }

    public static void buscarProductoPorId() {
        sc.nextLine();
        boolean encontrado = false;
        System.out.println("=============================================");
        System.out.println("--------- BUSCAR PRODUCTO - TECHLAB ---------");
        System.out.println("=============================================");
        int productoId = Utilidades.leerEntero(sc, "Ingresar ID del producto: ");
        for (Producto p: productos) {
            if (p.getId() == productoId) {
                System.out.println();
                System.out.println("=============================================");
                System.out.println("------------ PRODUCTO - TECHLAB -------------");
                System.out.println("=============================================");
                System.out.println(p);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println();
            System.out.println("=============================================");
            System.out.println("------------ PRODUCTO - TECHLAB -------------");
            System.out.println("=============================================");
            System.out.println("Producto inexistente. ❌");
        }
    }

    public static void eliminarProductoPorId() {
        sc.nextLine();
        boolean encontrado = false;
        System.out.println("=============================================");
        System.out.println("------------ PRODUCTO - TECHLAB -------------");
        System.out.println("=============================================");
        int eliminarId = Utilidades.leerEntero(sc, "Ingresar ID del producto a eliminar: ");

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId() == eliminarId) {
                productos.remove(i);
                System.out.println();
                System.out.println("=============================================");
                System.out.println("------------ PRODUCTO - TECHLAB -------------");
                System.out.println("=============================================");
                System.out.println("Producto eliminado correctamente. ✅");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println();
            System.out.println("=============================================");
            System.out.println("------------ PRODUCTO - TECHLAB -------------");
            System.out.println("=============================================");
            System.out.println("Producto inexistente. ❌");
        }

    }

    public static void crearPedido() {
        sc.nextLine();
        System.out.println("=============================================");
        System.out.println("-- INGRESE LOS DATOS DEL CLIENTE - TECHLAB --");
        System.out.println("=============================================");
        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Email del cliente: ");
        String email = sc.nextLine();

        // instanceo la clase cliente y pedido
        Cliente cliente = new Cliente(nombre, email);
        Pedido pedido = new Pedido(cliente);

        boolean seguir = true;
        while (seguir) {
            listarProductos();
            int id = Utilidades.leerEntero(sc, "Ingrese ID del producto a agregar (0 para terminar): ");
            if (id == 0) break;
            int cantidad = Utilidades.leerEntero(sc, "Ingrese la cantidad del producto a agregar: ");

            Producto seleccionado = productoSeleccionadoPorId(id);
            // Validamos que haya suficiente stock del producto seleccionado
            try {
                if(seleccionado != null) {
                    if (seleccionado.getCantidadStock() < cantidad){
                        throw new StockInsuficienteException("El stock de este producto es insuficiente para agregar al pedido. ❌");
                    }else {
                        seleccionado.actualizarCantidadStock(cantidad);
                        pedido.agregarProducto(seleccionado, cantidad);
                        System.out.println("Producto agregado exitosamente. ✅");
                    }
                } else {
                    System.out.println("Producto no encontrado. ❌");
                }
            } catch (StockInsuficienteException e) {
                System.out.println("Error al solicitar el producto: " + e.getMessage());
            }
        }
        // Capturamos errores al crear el pedido
        try {
            if (pedido.calcularTotal() == 0) {
                throw new PedidoException("No se puede crear un pedido vacio. ❌");
            } else {
                pedidos.add(pedido);
                System.out.println("Pedido creado con exito. ✅");
            }
        } catch (PedidoException e) {
            System.out.println("Error al crear el pedido: " + e.getMessage());
        }
    }

    private static Producto productoSeleccionadoPorId(int id) {
        for (Producto p: productos) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public static void listarPedidos() {
        // Si pedidos esta vacio => No hay pedidos generados
        if (pedidos.isEmpty()){
            System.out.println();
            System.out.println("=============================================");
            System.out.println("------------- PEDIDOS - TECHLAB -------------");
            System.out.println("=============================================");
            System.out.println("No hay pedidos generados. ❌");
            return;
        }
        // Si no lo esta => Recorremos la lista de pedidos
        System.out.println();
        System.out.println("=============================================");
        System.out.println("------------- PEDIDOS - TECHLAB -------------");
        System.out.println("=============================================");
        for (Pedido p: pedidos) {
            System.out.println(p);
        }

    }
}
