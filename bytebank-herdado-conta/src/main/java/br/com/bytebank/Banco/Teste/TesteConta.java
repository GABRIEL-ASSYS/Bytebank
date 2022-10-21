/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bytebank.Banco.Teste;

import br.com.bytebank.Banco.Especial.ContaEspecial;
import br.com.bytebank.Banco.Modelo.ContaCorrente;
import br.com.bytebank.Banco.Modelo.ContaPoupanca;
import br.com.bytebank.Banco.Modelo.SaldoInsuficienteException;

/**
 *
 * @author Usuario
 */
public class TesteConta {

    public static void main(String[] args) throws SaldoInsuficienteException {

        int a = 3;
        int b = a / 0;

        ContaCorrente outra = null;
        outra.deposita(200.0);

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());
    }
}
