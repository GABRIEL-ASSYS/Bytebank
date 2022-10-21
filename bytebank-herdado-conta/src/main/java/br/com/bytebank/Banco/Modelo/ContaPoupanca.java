/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bytebank.Banco.Modelo;

/**
 *
 * @author Usuario
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }
    
    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

}
