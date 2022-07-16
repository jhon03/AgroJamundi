package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {


    @Id
    @Column(name = "id_clie")
    private int idClie;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "sexo")
    private String sexo;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tiide")
    private TipoIdentificacion tipoIdentificacion;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Producto> productos = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente() {
    }
}
