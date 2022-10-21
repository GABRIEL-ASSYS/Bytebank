/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.encapsulado;

/**
 *
 * @author Usuario
 */
public class Conta {

    private double saldo = 100;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static quer dizer que pertence à classe como um todo
    private static int total;

    //relatório de inicialização
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println(" o total de contas é " + Conta.total);

        this.agencia = agencia;
        this.numero = numero;

        System.out.println(" estou criando uma conta! " + this.numero);
    }

    //criação de um método
    //o void é o que ele devolve
    //o double é o que ele recebe
    void deposita(double valor) {
        //this indica que o código se refere a um certo atributo
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println(" nao pode valor menor igual a zero! ");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println(" nao pode valor menor igual a zero! ");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
