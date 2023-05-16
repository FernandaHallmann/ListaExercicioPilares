package com.mycompany.ex3contacorrente;

/**
 *
 * @author Ferna
 */
public class ContaCorrente extends ContaBancaria {
    public double chequeEspecial (int dias, double taxa) {
        return (taxa / dias) * saldo;
    }
}
