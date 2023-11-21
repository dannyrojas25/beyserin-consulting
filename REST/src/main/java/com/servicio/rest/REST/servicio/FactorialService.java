package com.servicio.rest.REST.servicio;

import org.springframework.stereotype.Service;

@Service
public class FactorialService {
    public long calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }

        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
}
