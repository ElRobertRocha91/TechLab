package com.techlab.pedidos;

import com.techlab.clientes.Cliente;
import com.techlab.productos.Producto;

import java.util.ArrayList;

public class Pedido {
    // Variables
    private int id;
    private Cliente cliente;
    // private ArrayList<Producto> productos;
    private ArrayList<ItemPedido> items;
    private static int contadorPedidos = 1;

    // Constructor
    public Pedido(Cliente cliente) {
        this.id = contadorPedidos++;
        this.cliente = cliente;
        // this.productos = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    // Metodo
    public void agregarProducto(Producto producto, int cantidad) {
        // productos.add(producto);
        items.add(new ItemPedido(producto, cantidad));
    }

    public double calcularTotal() {
        double total = 0;
        // for (Producto p: productos) {
        //    total += p.getPrecio() * p.getCantidadStock();
        // }
        for (ItemPedido item: items) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public String toString() {
        return "Pedido #" + id + " - Cliente: " + cliente + " - Total: $" + calcularTotal();
    }
}

