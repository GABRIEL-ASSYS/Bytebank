/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.bytebank.Banco.Modelo;

/**
 *
 * Classe representa a moldura de uma conta
 *
 * @author Gabriel Assys
 * @version 0.1
 */
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static quer dizer que pertence à classe como um todo
    private static int total;

    /**
     *
     * Construtor para inicializar o objeto Conta a partir da agencia e numero.
     *
     * @param agencia
     * @param numero
     */
    //relatório de inicialização
    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println(" o total de contas é " + Conta.total);

        this.agencia = agencia;
        this.numero = numero;

        //System.out.println(" estou criando uma conta! " + this.numero);
    }

    //criação de um método
    //o void é o que ele devolve
    //o double é o que ele recebe
    public abstract void deposita(double valor);

    /**
     *
     * Valor precisa ser maior do que o saldo.
     *
     * @param valor
     * @throws SaldoInsuficienteException
     */
    public void saca(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
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
