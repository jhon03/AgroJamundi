package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.InventarioDTO;
import com.edu.usbcali.agroJamundi.Domain.Inventario;

public interface InventarioService {


    public Inventario crearInventario (InventarioDTO inventarioDTO) throws Exception;

}
