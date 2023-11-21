package com.servicio.rest.REST.controlador;

import com.servicio.rest.REST.modelo.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/{tipo}/{numeroDocumento}")
    public ResponseEntity<Cliente> getClienteInfo(
            @PathVariable String tipo,
            @PathVariable String numeroDocumento) {

        if (!validarTipoDocumento(tipo) || !validarNumeroDocumento(numeroDocumento)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Cliente cliente = obtenerDatosCliente();

        if (cliente != null) {
            return ResponseEntity.status(HttpStatus.OK).body(cliente);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    private boolean validarTipoDocumento(String tipo) {
        return tipo.equals("C") || tipo.equals("P");
    }

    private boolean validarNumeroDocumento(String numeroDocumento) {
        return numeroDocumento.length() > 0;
    }

    private Cliente obtenerDatosCliente() {
        return new Cliente("Juan", "Carlos", "Pérez", "Gómez", "123456789",
                "Calle 123", "Cúcuta");
    }
}
