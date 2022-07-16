package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion {

    @Id
    @Column(name = "id_tiide")
    private int idTiid;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "estado")
    private String estado;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIdentificacion")
    private List<Cliente>  clientes = new ArrayList<>();


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIdentificacion")
    private List<Agricultor> agricultores = new ArrayList<>();
    public TipoIdentificacion() {
    }
}
