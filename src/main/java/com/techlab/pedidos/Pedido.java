package com.techlab.pedidos;

import com.techlab.clientes.Cliente;
import com.techlab.productos.Producto;

import java.util.ArrayList;

public class Pedido {
    // Variables
    private int id;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private static int contadorPedidos = 0;

    // Constructor
    public Pedido(Cliente cliente) {
        this.id = contadorPedidos++;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    // Metodo
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p: productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public String toString() {
        return "Pedido #" + id + " - Cliente: " + cliente + " - Total: $" + calcularTotal();
    }
}

