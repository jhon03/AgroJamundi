package com.edu.usbcali.agroJamundi.DTO;

import lombok.Data;

@Data
public class InventarioDTO {

    private int idInventario;
    private String nombreProducto;
    private String nombreAgricultor;
    private  long cantidad;
    private float valorUnitario;
    private String categoria;
    private long salidaProducto;
    private long stockExistencias;
    private String codigoProducto;

    private int idProducto;
    private int idAgricultor;

}


