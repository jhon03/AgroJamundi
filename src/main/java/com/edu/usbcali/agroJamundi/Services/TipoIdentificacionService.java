package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.TipoIdentificacionDTO;
import com.edu.usbcali.agroJamundi.Domain.TipoIdentificacion;

public interface TipoIdentificacionService {

    public TipoIdentificacion crearTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacionDTO) throws Exception;


    public TipoIdentificacion findBId(Integer idTiid) throws Exception;
}
