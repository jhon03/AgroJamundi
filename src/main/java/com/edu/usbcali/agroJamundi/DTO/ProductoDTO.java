package com.edu.usbcali.agroJamundi.DTO;

import lombok.Data;

@Data
public class ProductoDTO {

    private int idProducto;
    private String nombre;
    private String codigo;
    private float precio;
    private String descripcion;
    private String estado;
    private String categoria;

    private Integer cliente;
}
