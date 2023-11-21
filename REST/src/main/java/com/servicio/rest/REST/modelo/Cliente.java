package com.servicio.rest.REST.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Cliente {
        private  String primerNombre;
        private  String segundoNombre;
        private  String primerApellido;
        private  String segundoApellido;
        private  String telefono;
        private  String direccion;
        private  String ciudadResidencia;
}
