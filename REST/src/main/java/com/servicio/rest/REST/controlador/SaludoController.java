package com.servicio.rest.REST.controlador;

import com.servicio.rest.REST.modelo.Saludo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/hola")
    public Saludo getClienteInfo() {
        String nombreEquipo = "Danny Rojas"; // Cambia esto al nombre de tu equipo
        return new Saludo("¡Hola desde el equipo " + nombreEquipo + "!");
    }
}
