package com.edu.usbcali.agroJamundi.DTO;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
public class TipoIdentificacionDTO {

    private int idTiid;
    private String codigo;
    private String nombre;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String estado;



}
