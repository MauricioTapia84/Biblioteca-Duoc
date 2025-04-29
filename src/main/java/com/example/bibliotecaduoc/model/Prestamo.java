package com.example.bibliotecaduoc.model;

import com.example.bibliotecaduoc.model.Libro;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    private int idPrestamo;//Incrementable
    private int idLibro=getIdLibro(); //fk Libro
    private String rut;
    private Date fechaSolicitud;
    private Date fechaEntrega; //null
    private int catidadDias;
    private int multas;

}

