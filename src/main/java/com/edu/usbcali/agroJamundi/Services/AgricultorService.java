package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.AgricultorDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;

public interface AgricultorService {

    public Agricultor findById (Integer idAgricultor) throws Exception;

    public Agricultor crearAgricultor(AgricultorDTO agricultorDTO) throws Exception;



}
