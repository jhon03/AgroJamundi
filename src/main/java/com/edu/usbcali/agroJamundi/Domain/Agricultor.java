package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "agricultor")
public class Agricultor {

    @Id
    @Column(name = "id_agricultor")
    private int idAgric;

    @Column (name = "numero_identificacion")
    private String numeroIdentificacion;


    @Column(name = "nombre")
    private String nombre;


    @Column(name = "correo")
    private String email;

    @Column(name = "telefono")
    private String telefono;


    @Column(name = "sexo")
    private String sexo;

    @Column(name = "actividad_agricultor")
    private String actividadAgricultor;


    //llave foranea
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tiide")
    private TipoIdentificacion tipoIdentificacion;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agricultor")
    private List<Inventario> inventarios = new ArrayList<>();




}
