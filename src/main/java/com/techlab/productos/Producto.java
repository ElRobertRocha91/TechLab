package com.techlab.productos;

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

    // Metodo
    public String toString() {
        return  "ID: " + id + " | " + nombre + " - $" + precio;
    }

}