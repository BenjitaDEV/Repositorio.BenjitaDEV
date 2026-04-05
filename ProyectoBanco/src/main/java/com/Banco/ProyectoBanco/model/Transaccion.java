package com.Banco.ProyectoBanco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {
    private int id;
    private String tipo;
    private double monto;
    private int cuentaId;
    
}
