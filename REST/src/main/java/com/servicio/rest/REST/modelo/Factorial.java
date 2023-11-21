package com.servicio.rest.REST.modelo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class Factorial {

    private int numero;
    private long factorial;

    public Factorial(int numero, long factorial) {
        this.numero = numero;
        this.factorial = factorial;
    }

    public int getNumero() {
        return numero;
    }

    public long getFactorial() {
        return factorial;
    }
}
