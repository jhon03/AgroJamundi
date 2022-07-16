package com.edu.usbcali.agroJamundi.RestController;


import com.edu.usbcali.agroJamundi.DTO.AgricultorDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import com.edu.usbcali.agroJamundi.Services.AgricultorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/agricultor")
public class AgricultorRestController {

    @Autowired
    private AgricultorService agricultorService;

    @PostMapping("/crear/agricultor")
    public ResponseEntity<?> crearAgricultor(@RequestBody AgricultorDTO agricultorDTO) {

        try {
            Agricultor agricultor = agricultorService.crearAgricultor(agricultorDTO);
            return ResponseEntity.ok().body(agricultor);

        } catch (Exception e) {
           return (ResponseEntity<?>) ResponseEntity.accepted();
        }
    }

}
