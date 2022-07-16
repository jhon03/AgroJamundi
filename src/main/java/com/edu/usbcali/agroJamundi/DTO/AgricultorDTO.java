package com.edu.usbcali.agroJamundi.DTO;

import lombok.Data;

@Data
public class AgricultorDTO {

    private int idAgric;
    private String numeroIdentificacion;
    private String nombre;
    private String email;
    private String telefono;
    private String sexo;
    private String actividadAgricultor;

    //lave foranea
    private int idTiid;
}
