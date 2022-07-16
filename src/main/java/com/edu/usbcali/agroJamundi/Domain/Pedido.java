package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @Column(name = "id_pedido")
    private int idPedido;

    @Column(name = "cantidad")
    private long cantidad;

    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Column(name = "estado")
    private String estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_clie")
    private Cliente cliente;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
    private List<DetallePedido> detallePedidos= new ArrayList<>();

}


