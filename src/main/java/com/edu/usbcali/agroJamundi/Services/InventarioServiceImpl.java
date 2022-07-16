package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.InventarioDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import com.edu.usbcali.agroJamundi.Domain.Inventario;
import com.edu.usbcali.agroJamundi.Domain.Producto;
import com.edu.usbcali.agroJamundi.JpaRepository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class InventarioServiceImpl implements InventarioService{

    @Autowired
    private ProductoService productoService;

    @Autowired
    private InventarioRepository inventarioRepository;

    @Autowired
    private AgricultorService agricultorService;
    @Override
    public Inventario crearInventario(InventarioDTO inventarioDTO) throws Exception {

        Inventario inventario = new Inventario();

        inventario.setIdInventario(inventarioDTO.getIdInventario());
        inventario.setNombreProducto(inventarioDTO.getNombreProducto());
        inventario.setNombreAgricultor(inventarioDTO.getNombreAgricultor());
        inventario.setCantidad(inventario.getCantidad());
        inventario.setValorUnitario(inventario.getValorUnitario());
        inventario.setCategoria(inventario.getCategoria());
        inventario.setSalidaProducto(inventarioDTO.getSalidaProducto());
        inventario.setStockExistencias(inventarioDTO.getStockExistencias());
        inventario.setCodigoProducto(inventarioDTO.getCodigoProducto());


        Producto producto = productoService.findById(inventarioDTO.getIdProducto());
        // validamos_que_el_producto del agricultor _exista_y_este_activo
        if(producto == null) {
            throw new Exception("EL producto con" + inventarioDTO.getIdProducto()+ " No existe");
        }
        inventario.setProducto(producto);

        Agricultor agricultor = agricultorService.findById(inventarioDTO.getIdAgricultor());
        // validamos_que_el_tipo_identificacion del agricultor _exista_y_este_activo
        if(agricultor == null) {
            throw new Exception("EL agricultor con" + inventarioDTO.getIdAgricultor()+ " No existe");
        }
        inventario.setAgricultor(agricultor);

        inventarioRepository.save(inventario);

        return inventario;

    }
}
