package com.edu.usbcali.agroJamundi.Domain;

import java.util.Date;

public class Factura {


    private int idFactura;
    private String codigo;
    private String descripcion;
    private Date fechaCreacion;
    private float valorPagado;


    private Pagos pagos;
}
