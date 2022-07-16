package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.ClienteDTO;
import com.edu.usbcali.agroJamundi.Domain.Cliente;

public interface ClienteService {

    public Cliente findById (Integer idClie) throws Exception;

    public Cliente crearCliente(ClienteDTO clienteDTO) throws Exception;
}
