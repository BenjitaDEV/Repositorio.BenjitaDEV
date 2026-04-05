package com.Banco.ProyectoBanco.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Banco.ProyectoBanco.model.Cuenta;
import com.Banco.ProyectoBanco.service.CuentaService;

@RestController
@RequestMapping("/api/v1/Cuentas")
public class CuentaController {
    @Autowired
    private CuentaService cuentaService;

    //LISTAR
    @GetMapping
    public List<Cuenta> listar(){
        return cuentaService.getCuenta();
    }

    //BUSCAR POR ID
    @GetMapping("/{id}")
    public Cuenta buscar(@PathVariable int id){
        return cuentaService.getCuentaId(id);
    }

    //CREAR
    @PostMapping
    public Cuenta guardar(@RequestBody Cuenta cuenta){
        return cuentaService.saveCuenta(cuenta);
    }

    //ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminar (@PathVariable int id){
        return cuentaService.deleteCuenta(id);
    }

    //TRANSFERENCIA
    @PostMapping("/transferir")
    public String transferir(@RequestBody Map<String, Object> datos){
        int origen  = Integer.parseInt(datos.get("origen").toString());
        int destino = Integer.parseInt(datos.get("destino").toString());
        double monto = Double.parseDouble(datos.get("monto").toString());
        
        return cuentaService.transferir(origen, destino, monto);
    }

    @PostMapping("/depositar")
    public String depositar (@RequestBody Map<String, Object> datos){
        int id = Integer.parseInt(datos.get("id").toString());
        double monto = Double.parseDouble(datos.get("monto").toString());
        
        return cuentaService.depositar(id, monto);
        
    }

    @PostMapping("/retirar")
    public String retirar (@RequestBody Map<String, Object> datos){
        int id = Integer.parseInt(datos.get("id").toString());
        double monto = Double.parseDouble((datos.get("monto").toString()));

        return cuentaService.retirar(id, monto);
    }


}
