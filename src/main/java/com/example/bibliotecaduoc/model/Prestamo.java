package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    private Int id_prestamo;//Incrementable
    private Libro libro;
    private String fecha_solicitud;
    private String fecha_entrega;

}
