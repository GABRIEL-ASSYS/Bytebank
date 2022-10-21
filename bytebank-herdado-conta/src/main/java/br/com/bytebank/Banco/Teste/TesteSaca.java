/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bytebank.Banco.Teste;

import br.com.bytebank.Banco.Modelo.Conta;
import br.com.bytebank.Banco.Modelo.ContaCorrente;
import br.com.bytebank.Banco.Modelo.SaldoInsuficienteException;

/**
 *
 * @author Usuario
 */
public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Ex: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
