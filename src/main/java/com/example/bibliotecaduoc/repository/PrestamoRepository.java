package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import com.example.bibliotecaduoc.model.Prestamo;

import java.util.List;
import java.util.ArrayList;

@Repository
public class PrestamoRepository {

    //Crear lista de prestamos para enseñar
    List<Prestamo> listaPrestamos = new ArrayList<>();

    //Metodo para mostrar los prestamos
    public List<Prestamo> obetenerListaPrestamos(){
        return listaPrestamos;

    }

    //Buscar por Id de prestamo
    public Prestamo buscarPorIdPrestamo(int id){
        for (Prestamo prestamo : listaPrestamos) {
            if(prestamo.getIdPrestamo() == id){
                return prestamo;
            }
        }
        return null;
    }

    //Buscar por Id de Libro
    public Prestamo buscarPorIdLibro(int id){
        for (Prestamo prestamo : listaPrestamos) {
            if(prestamo.getIdLibro() == id){
                return prestamo;
            }
        }
        return null;
    }

    //Crear o pedir prestamo
    public Prestamo guardar(Prestamo prestamo){

        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo actualizar(Prestamo prestamo){
        int id =0;
        int idPosicion = 0;

        for (int i = 0; i < listaPrestamos.size(); i++) {
            if (listaPrestamos.get(i).getIdPrestamo() == prestamo.getIdPrestamo()){
                id = prestamo.getIdPrestamo();
                idPosicion = i;
            }
        }

        Prestamo prestamoNuevo = new Prestamo();
        prestamoNuevo.setIdPrestamo(id);
        prestamoNuevo.setIdLibro(prestamo.getIdLibro());
        prestamoNuevo.setRut(prestamo.getRut());
        prestamoNuevo.setFechaSolicitud(prestamo.getFechaSolicitud());
        prestamoNuevo.setFechaEntrega(prestamo.getFechaEntrega());
        prestamoNuevo.setCatidadDias(prestamo.getCatidadDias());
        prestamoNuevo.setMultas(prestamo.getMultas());

        listaPrestamos.set(idPosicion, prestamoNuevo);
        return prestamoNuevo;

    }

    //eliminar un prestamo
    public void eliminar(int id){
        Prestamo prestamo = buscarPorIdPrestamo(id);
        listaPrestamos.remove(prestamo);
    }


}
