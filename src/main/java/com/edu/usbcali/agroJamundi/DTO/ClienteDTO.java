package com.edu.usbcali.agroJamundi.DTO;

import lombok.Data;

@Data
public class ClienteDTO {

    private int    idClie;
    private String numeroIdentificacion;
    private String nombre;
    private String correo;
    private String telefono;
    private String sexo;

    private int idTiid;

}
