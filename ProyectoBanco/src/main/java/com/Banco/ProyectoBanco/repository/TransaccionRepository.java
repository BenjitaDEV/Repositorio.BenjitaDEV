package com.Banco.ProyectoBanco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Banco.ProyectoBanco.model.Transaccion;

@Repository
public class TransaccionRepository {
    private List<Transaccion> listaTransacciones = new ArrayList<>();

    private List<Transaccion> obtenerTransacciones(){
        return listaTransacciones;
    }

    public Transaccion guardar(Transaccion t){
        listaTransacciones.add(t);
        return t;
    }


}
