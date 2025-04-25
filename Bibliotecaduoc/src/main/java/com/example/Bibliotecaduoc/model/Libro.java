package com.example.Bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//GETTER AND SETTER
@Data
//CONSTRUCTOR CON TODOS LOS ARGUMENTOS
@AllArgsConstructor
//CONSTRUCTOR VACIO
@NoArgsConstructor

public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String fechaPublicacion;
    private String autor;

}
