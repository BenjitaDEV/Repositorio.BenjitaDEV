package com.Banco.ProyectoBanco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banco.ProyectoBanco.model.Cuenta;
import com.Banco.ProyectoBanco.repository.CuentaRepository;

@Service
public class CuentaService {
    @Autowired
    private CuentaRepository cuentaRepository;

    //AGREGAR METODOS
    //LISTA
    public List<Cuenta> getCuenta(){
        return cuentaRepository.obtenerCuentas();
    }

    //BUSCAR POR ID

    public Cuenta getCuentaId(int id){
        return cuentaRepository.BuscarPorId(id);
    }

    public Cuenta updateCuenta(Cuenta cuenta){
        return cuentaRepository.actualizar(cuenta);
    }

    public Cuenta saveCuenta (Cuenta cuenta){
        return cuentaRepository.guardar(cuenta);
    }

    public String deleteCuenta(int id){
        cuentaRepository.eliminar(id);
        return "Cuenta eliminado";
    }
    
    //LA ACCION LA HACE SERVICE
    public int totalCuentas(){
        return cuentaRepository.totalCuentas();
    }

    //METODO TRANSFERIR
    //crea parametros
    public String transferir(int origenId, int destinoId, double monto){
        Cuenta origen = cuentaRepository.BuscarPorId(origenId);
        Cuenta destino = cuentaRepository.BuscarPorId(destinoId);

        if (origen == null || destino == null){// si una de las cuentas no existe, es invalido
            return "Cuenta no encontrada";
        }
        if (monto <= 0){ //si el monto es 0 o negativo el monto es invalido
            return "Monto invalido";
        }
        if (origen.getSaldo()< monto){// verifica que haya saldo suficiente
            return "Saldo insuficiente";
        }

        origen.setSaldo(origen.getSaldo() - monto);
        destino.setSaldo(destino.getSaldo() + monto);

        cuentaRepository.actualizar(origen);
        cuentaRepository.actualizar(destino);

        return "transferencia realizada";
    }

    public String depositar(int id, double monto){
        Cuenta cuenta = cuentaRepository.BuscarPorId(id);

        if (cuenta == null){
            return "Cuenta no encontrada";
        }
        if(monto <= 0){
            return "Monto invalido";
        }

        cuenta.setSaldo(cuenta.getSaldo() + monto);
        cuentaRepository.actualizar(cuenta);

        return "Deposito realizado";
    }

    public String retirar(int id, double monto){

        Cuenta cuenta = cuentaRepository.BuscarPorId(id);

        if (cuenta == null){
            return "cuenta no encontrada";
        }

        if (monto <= 0){
            return "monto invalido";
        }

        if (cuenta.getSaldo() < monto){
            return "Saldo insuficiente";
        }

        cuenta.setSaldo(cuenta.getSaldo()-monto);

        return "Retiro realizado";
    }

}
