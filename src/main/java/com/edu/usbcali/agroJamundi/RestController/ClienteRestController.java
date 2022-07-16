package com.edu.usbcali.agroJamundi.RestController;

import com.edu.usbcali.agroJamundi.DTO.AgricultorDTO;
import com.edu.usbcali.agroJamundi.DTO.ClienteDTO;
import com.edu.usbcali.agroJamundi.Domain.Agricultor;
import com.edu.usbcali.agroJamundi.Domain.Cliente;
import com.edu.usbcali.agroJamundi.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api/cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/crear/cliente")
    public ResponseEntity<?> crearCliente(@RequestBody ClienteDTO clienteDTO) {

        try {
            Cliente cliente = clienteService.crearCliente(clienteDTO);
            return ResponseEntity.ok().body(cliente);

        } catch (Exception e) {
            return (ResponseEntity<?>) ResponseEntity.accepted();
        }
    }
}