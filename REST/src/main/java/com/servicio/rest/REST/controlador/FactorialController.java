package com.servicio.rest.REST.controlador;

import com.servicio.rest.REST.modelo.Factorial;
import com.servicio.rest.REST.servicio.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FactorialController {

    @Autowired
    private FactorialService factorialService;

    @GetMapping("/factorial/{numero}")
    public Factorial calcularFactorial(@PathVariable int numero) {
        long resultado = factorialService.calcularFactorial(numero);
        return new Factorial(numero, resultado);
    }
}
