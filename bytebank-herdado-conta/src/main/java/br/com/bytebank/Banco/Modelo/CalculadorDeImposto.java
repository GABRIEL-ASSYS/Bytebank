/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bytebank.Banco.Modelo;

/**
 *
 * @author Usuario
 */
public class CalculadorDeImposto {
    
    private double totalImposto;
    
    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor; 
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
