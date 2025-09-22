package com.techlab.productos;

import com.techlab.excepciones.StockInsuficienteException;

public class Producto {
    // Variables
    private int id;
    private String nombre;
    private double precio;
    private int cantidadStock;

    // Constructor
    public Producto(int id, String nombre, double precio, int cantidadStock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        if(cantidadStock >= 0){
            this.cantidadStock = cantidadStock;
        } else {
            System.out.println("No se puede asignar Stock negativo.");
        }
    }

    // Metodo
    public String toString() {
        return  "ID: " + id + " | " + nombre + " - $" + precio + " - Stock: " + cantidadStock;
    }

    public void actualizarCantidadStock(int cantidad) throws StockInsuficienteException {
        if (cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
        } else {
            throw new StockInsuficienteException("Stock insuficiente. No se puede descontar " + cantidad + " unidades.");
        }
    }

}