package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.ClienteDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import com.edu.usbcali.agroJamundi.Domain.Cliente;
import com.edu.usbcali.agroJamundi.Domain.TipoIdentificacion;
import com.edu.usbcali.agroJamundi.JpaRepository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class ClienteServiceImpl  implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    @Override
    public Cliente findById(Integer idClie) throws Exception {

        if (!clienteRepository.findById(idClie).isPresent()){
            throw new Exception("el cliente con id" + idClie + "No existe");
        }
        return clienteRepository.findById(idClie).get();
    }

    @Override
    public Cliente crearCliente(ClienteDTO clienteDTO) throws Exception {

       Cliente cliente= new Cliente() ;

        cliente.setIdClie(clienteDTO.getIdClie());
        cliente.setNumeroIdentificacion(clienteDTO.getNumeroIdentificacion());
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setCorreo(clienteDTO.getCorreo());
        cliente.setTelefono(clienteDTO.getTelefono());
        cliente.setSexo(clienteDTO.getSexo());

        TipoIdentificacion tipoIdentificacion = tipoIdentificacionService.findBId(clienteDTO.getIdTiid());
        // validamos_que_el_tipo_identificacion del agricultor _exista_y_este_activo
        if(tipoIdentificacion == null) {
            throw new Exception("lA identificación" + clienteDTO.getIdTiid()+ " No existe");
        }
        cliente.setTipoIdentificacion(tipoIdentificacion);
         clienteRepository.save(cliente);
        return cliente;
    }
}
