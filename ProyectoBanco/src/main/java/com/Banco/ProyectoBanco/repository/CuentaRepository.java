package com.Banco.ProyectoBanco.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Banco.ProyectoBanco.model.Cuenta;;

@Repository
public class CuentaRepository {
    //metodos
    private List<Cuenta> listaCuentas = new ArrayList<>();

    //listar todas las cuentas, devuelve lista
    public List<Cuenta> obtenerCuentas(){
        return listaCuentas;
    }

    //buscar cuenta por id, devuelve cuenta
    public Cuenta BuscarPorId(int id){
        for(Cuenta cuenta : listaCuentas){
            if(cuenta.getId() == id){
                return cuenta;
            }
        }

        return null;
    }

    //guardar cuenta, crear y actualizar
    //GUARDAR
    public Cuenta guardar(Cuenta cuen){
        listaCuentas.add(cuen);
        return cuen;
    }
    //ACTUALIZAR
    public Cuenta actualizar(Cuenta cuen){
        int id = 0;
        int idPosition = -1;

        for (int i = 0; i < listaCuentas.size(); i++) { //crea un contador que empieza de 0
            if (listaCuentas.get(i).getId()== cuen.getId()){ //de la posicion muestra el id y lo compara
                id = cuen.getId(); //cambia de valor de id = 0
                idPosition = i;// guarda la posicion, es clave para actualizar dsps
                break;
            }
        }

        if (idPosition == -1){
            return null; // no existe la cuenta
        }
        //creamos nueva cuenta con datos 
        // Cuenta cuenta1 = new Cuenta();
        // cuenta1.setId(id);
        // cuenta1.setTitular(cuen.getTitular());
        // cuenta1.setTipo(cuen.getTipo());
        // cuenta1.setSaldo(cuen.getSaldo());

        listaCuentas.set(idPosition, cuen);
        return cuen;//retorna la nueva cuenta
    }

    //eliminar cuenta
    //usamos void ya que no devuelve nada
    public void eliminar(int id){
        Cuenta cuenta = BuscarPorId(id);
        if (cuenta != null) {
            listaCuentas.remove(cuenta);
        }
        
    }

    public int totalCuentas(){
        return listaCuentas.size();
    }
}
