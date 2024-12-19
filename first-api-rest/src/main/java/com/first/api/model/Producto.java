package com.first.api.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private double precio;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}
