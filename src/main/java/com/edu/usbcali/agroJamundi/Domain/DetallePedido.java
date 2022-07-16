package com.edu.usbcali.agroJamundi.Domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {

    @Id
    @Column(name = "detalle_pedido")
    private int detPedido;

    @Column(name = "precio")
    private float precio;

    @Column(name = "cantidad")
    private long cantidad;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;






}
