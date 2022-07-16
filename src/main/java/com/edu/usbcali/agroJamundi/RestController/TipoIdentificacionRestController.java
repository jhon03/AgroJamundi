package com.edu.usbcali.agroJamundi.RestController;


import com.edu.usbcali.agroJamundi.DTO.TipoIdentificacionDTO;
import com.edu.usbcali.agroJamundi.Domain.TipoIdentificacion;
import com.edu.usbcali.agroJamundi.Services.TipoIdentificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/tipoIdentificacion")
public class TipoIdentificacionRestController {

    @Autowired
    private TipoIdentificacionService tIpoIdentificacionService;

    @PostMapping("/save/tipoIdentificacion")
    public ResponseEntity<?> guardarTipoIdentificacion(@RequestBody TipoIdentificacionDTO tipoIdentificacionDTO){

        try {
            TipoIdentificacion tipoIdentificacion = tIpoIdentificacionService.crearTipoIdentificacion(tipoIdentificacionDTO);
            return ResponseEntity.ok().body(tipoIdentificacion);

        }catch (Exception e){
            return ResponseEntity.ok(e.getMessage());
        }
    }
}
