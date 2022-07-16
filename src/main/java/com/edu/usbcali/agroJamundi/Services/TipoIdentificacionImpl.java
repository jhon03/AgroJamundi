package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.TipoIdentificacionDTO;
import com.edu.usbcali.agroJamundi.Domain.TipoIdentificacion;
import com.edu.usbcali.agroJamundi.JpaRepository.TipoIdentificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class TipoIdentificacionImpl implements TipoIdentificacionService {

    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;

    @Override
    public TipoIdentificacion crearTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacionDTO) throws Exception {

        TipoIdentificacion tipoIdentificacion = null;

        tipoIdentificacion = new TipoIdentificacion();

        tipoIdentificacion.setIdTiid(tipoIdentificacionDTO.getIdTiid());
        tipoIdentificacion.setCodigo(tipoIdentificacionDTO.getCodigo());
        tipoIdentificacion.setNombre(tipoIdentificacionDTO.getNombre());
        tipoIdentificacion.setFechaCreacion(tipoIdentificacionDTO.getFechaCreacion());
        tipoIdentificacion.setFechaModificacion(tipoIdentificacionDTO.getFechaModificacion());
        tipoIdentificacion.setEstado(tipoIdentificacionDTO.getEstado());

        tipoIdentificacionRepository.save(tipoIdentificacion);
        return tipoIdentificacion;
    }

    @Override
    public TipoIdentificacion findBId(Integer idTiid) throws Exception {


        return tipoIdentificacionRepository.findById(idTiid).get();
    }
}
