package com.servicio.rest.REST;

import com.servicio.rest.REST.controlador.FactorialController;
import com.servicio.rest.REST.modelo.Factorial;
import com.servicio.rest.REST.servicio.FactorialService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class FactorialServiceTest {

    @Mock
    private FactorialService factorialService;

    @InjectMocks
    private FactorialController factorialController;

    @Test
    public void testCalcularFactorial() {
        int numero = 8;
        long resultadoEsperado = 40320;
        when(factorialService.calcularFactorial(numero)).thenReturn(resultadoEsperado);

        Factorial resultadoActual = factorialController.calcularFactorial(numero);

        assertEquals(resultadoEsperado, resultadoActual.getFactorial());
    }

    @Test
    public void testCalcularFactorialConNumeroCero() {
        int numero = 0;
        long resultadoEsperado = 1;
        when(factorialService.calcularFactorial(numero)).thenReturn(resultadoEsperado);

        long resultadoActual = factorialService.calcularFactorial(numero);

        assertEquals(resultadoEsperado, resultadoActual);
    }

}
