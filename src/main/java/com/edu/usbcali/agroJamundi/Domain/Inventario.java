package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "inventario")
public class Inventario {

    @Id
    @Column(name = "id_inventario")
    private int idInventario;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "nombre_agricultor")
    private String nombreAgricultor;

    @Column(name = "cantidad")
    private  long cantidad;

    @Column(name = "valor_unitario")
    private float valorUnitario;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "salida_producto")
    private long salidaProducto;

    @Column(name = "stock_existencias")
    private long stockExistencias;

    @Column(name = "codigo_producto")
    private String codigoProducto;


    //llaves foranesas

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agricultor")
    private Agricultor agricultor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

}
