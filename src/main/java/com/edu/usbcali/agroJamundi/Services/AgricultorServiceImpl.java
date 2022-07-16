package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.AgricultorDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import com.edu.usbcali.agroJamundi.Domain.TipoIdentificacion;
import com.edu.usbcali.agroJamundi.JpaRepository.AgricultorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class AgricultorServiceImpl implements AgricultorService {


    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;
    @Autowired
    private AgricultorRepository agricultorRepository;

    @Override
    public Agricultor findById(Integer idAgricultor) throws Exception {

        if (!agricultorRepository.findById(idAgricultor).isPresent()){
            throw new Exception("El usuario con id: "+ idAgricultor +"\n" + "no existe");
        }
        return agricultorRepository.findById(idAgricultor).get();
    }

    @Override
    public Agricultor crearAgricultor(AgricultorDTO agricultorDTO) throws Exception {

        Agricultor  agricultor = new Agricultor() ;

        agricultor.setIdAgric(agricultorDTO.getIdAgric());
        agricultor.setNumeroIdentificacion(agricultorDTO.getNumeroIdentificacion());
        agricultor.setNombre(agricultorDTO.getNombre());
        agricultor.setEmail(agricultorDTO.getEmail());
        agricultor.setTelefono(agricultorDTO.getTelefono());
        agricultor.setSexo(agricultorDTO.getSexo());
        agricultor.setActividadAgricultor(agricultorDTO.getActividadAgricultor());

        TipoIdentificacion  tipoIdentificacion = tipoIdentificacionService.findBId(agricultorDTO.getIdTiid());
        // validamos_que_el_tipo_identificacion del agricultor _exista_y_este_activo
        if(tipoIdentificacion == null) {
            throw new Exception("lA identificación" + agricultorDTO.getIdTiid()+ " No existe");
        }

        agricultor.setTipoIdentificacion(tipoIdentificacion);


        agricultorRepository.save(agricultor);

        return agricultor;
    }
}
