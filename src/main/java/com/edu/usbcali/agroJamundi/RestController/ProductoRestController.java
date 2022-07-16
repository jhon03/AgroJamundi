package com.edu.usbcali.agroJamundi.RestController;

import com.edu.usbcali.agroJamundi.DTO.ProductoDTO;
import com.edu.usbcali.agroJamundi.Domain.Producto;
import com.edu.usbcali.agroJamundi.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/producto")
public class ProductoRestController {

    @Autowired
    private ProductoService productoService;


    @PostMapping("/save/producto")
    public ResponseEntity<?> saveProduct(@RequestBody ProductoDTO productoDTO){

        try {
            Producto producto = productoService.crearProducto(productoDTO);
            return ResponseEntity.ok().body(producto);
        }catch (Exception e){
            return ResponseEntity.ok(e.getMessage());
        }
    }
}
