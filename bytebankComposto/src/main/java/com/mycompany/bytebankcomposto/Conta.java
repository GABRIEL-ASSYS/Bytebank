/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebankcomposto;

/**
 *
 * @author Usuario
 */
public class Conta {
    
    private double saldo = 100;
    int agencia;
    int numero;
    Cliente titular;
    
    //criação de um método
    //o void é o que ele devolve
    //o double é o que ele recebe
    void deposita(double valor) {
        //this indica que o código se refere a um certo atributo
        this.saldo += valor;
    }
    
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
        
    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
}
