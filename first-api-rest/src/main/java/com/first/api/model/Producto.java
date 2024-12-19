package com.first.api.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Producto {

    private int id;
    private String nombre;
    private int cantidad;
    private double precio;



}
