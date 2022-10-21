/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.encapsulado;

/**
 *
 * @author Usuario
 */
public class TestaGetESet {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta(1337, 24226);
        
        System.out.println(conta.getNumero());
        
        Cliente paulo = conta.getTitular();
        paulo.setNome("Paulo Silveira");
        
        conta.setTitular(paulo);
        
        System.out.println(conta.getTitular().getNome());
        
        conta.getTitular().setProfissao("programador");
        
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        
        System.out.println(titularDaConta);
        System.out.println(paulo);
        System.out.println(conta.getTitular());
        
    }
    
}
