package com.edu.usbcali.agroJamundi.Services;

import com.edu.usbcali.agroJamundi.DTO.ProductoDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import com.edu.usbcali.agroJamundi.Domain.Cliente;
import com.edu.usbcali.agroJamundi.Domain.Inventario;
import com.edu.usbcali.agroJamundi.Domain.Producto;
import com.edu.usbcali.agroJamundi.JpaRepository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("singleton")
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private ClienteService clienteService;

    @Autowired
    private AgricultorService agricultorService;


    @Override
    public Producto crearProducto(ProductoDTO productoDTO) throws Exception {

        Producto producto = null;

        Cliente cliente = null;

        producto  = new Producto();


        producto.setIdProducto(productoDTO.getIdProducto());
        producto.setCodigo(productoDTO.getCodigo());
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setDescripcion(productoDTO.getDescripcion());
        producto.setEstado(productoDTO.getEstado());
        producto.setCategoria(productoDTO.getCategoria());

        cliente = clienteService.findById(productoDTO.getCliente());
        producto.setCliente(cliente);

       productoRepository.save(producto);
        return producto;
    }

    @Override
    public Producto findById(Integer idProducto) throws Exception {

        if (!productoRepository.findById(idProducto).isPresent()){
            throw new Exception("el producto con id" + idProducto + "NO existe en la BD");
        }
        return productoRepository.findById(idProducto).get();
    }
}
