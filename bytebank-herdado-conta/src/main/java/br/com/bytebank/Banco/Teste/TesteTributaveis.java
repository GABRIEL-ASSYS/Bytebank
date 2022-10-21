/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bytebank.Banco.Teste;

import br.com.bytebank.Banco.Modelo.CalculadorDeImposto;
import br.com.bytebank.Banco.Modelo.ContaCorrente;
import br.com.bytebank.Banco.Modelo.SeguroDeVida;

/**
 *
 * @author Usuario
 */
public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100.0);
        
        SeguroDeVida seguro = new SeguroDeVida();
        
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);
        
        System.out.println(calc.getTotalImposto());
    }
}
