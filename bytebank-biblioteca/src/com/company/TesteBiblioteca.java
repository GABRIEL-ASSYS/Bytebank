package com.company;

import br.com.bytebank.Banco.Modelo.Conta;
import br.com.bytebank.Banco.Modelo.ContaCorrente;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Conta c = new ContaCorrente(123, 321);

        c.deposita(200.0);

        System.out.println(c.getSaldo());
    }
}
