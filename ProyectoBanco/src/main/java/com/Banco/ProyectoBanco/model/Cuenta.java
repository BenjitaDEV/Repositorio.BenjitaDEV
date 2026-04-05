package com.Banco.ProyectoBanco.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
    private int id;
    private String titular;
    private String tipo; //corriente o ahorro
    private double saldo;

}
