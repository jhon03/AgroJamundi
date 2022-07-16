package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "producto")
public class Producto {


    @Id
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "precio")
    private float precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "categoria")
    private String categoria;


    //llaves foraneas

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_clie")
    private Cliente cliente;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
    private List<Inventario> inventarios = new ArrayList<>();
}
