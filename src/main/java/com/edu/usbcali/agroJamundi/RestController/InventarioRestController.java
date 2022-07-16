package com.edu.usbcali.agroJamundi.RestController;


import com.edu.usbcali.agroJamundi.DTO.InventarioDTO;
import com.edu.usbcali.agroJamundi.Domain.Inventario;
import com.edu.usbcali.agroJamundi.Services.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventario")
public class InventarioRestController {

    @Autowired
    private InventarioService inventarioService;

    @PostMapping("/guardar/inventario")
    public ResponseEntity<?> crearInventario(@RequestBody InventarioDTO inventarioDTO){

        try {
            Inventario inventario = inventarioService.crearInventario(inventarioDTO);
            return ResponseEntity.ok().body(inventario);
        }catch (Exception e){
            return ResponseEntity.ok(e.getMessage());
        }
    }
}
