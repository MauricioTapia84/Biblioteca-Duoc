package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoControlador {

    @Autowired
    PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos(){
        return prestamoService.getPrestamos();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)//Colocar el codigo 201
    public Prestamo agregarPrestamo(@RequestBody Prestamo prestamo){
        return prestamoService.savePrestamo(prestamo);
    }

    @GetMapping("{id}")
    public Prestamo buscarPrestamo(@PathVariable int id){
        return prestamoService.getPrestamoId(id);
    }

    @PutMapping("{id}")
    public Prestamo actualizarPrestamo(@PathVariable int id, @RequestBody Prestamo prestamo){
        return prestamoService.updatePrestamo(prestamo);
    }
    @DeleteMapping("{id}")
    public String eliminarPrestamo(@PathVariable int id) {
        return prestamoService.deletePrestamo(id);

    }

}
