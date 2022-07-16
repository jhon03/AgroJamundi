package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.ProductoDTO;
import com.edu.usbcali.agroJamundi.Domain.Producto;

public interface ProductoService {

    public Producto crearProducto(ProductoDTO productoDTO) throws Exception;

    public Producto findById(Integer idProducto) throws Exception;

}
