package com.techlab.clientes;

public class Cliente {
    // Variables
    private String nombre;
    private String email;

    // Constructor
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Metodo Getters
    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    // Metodo
    public String toString() {
        return nombre + "("+email+ ")";
    }
}
