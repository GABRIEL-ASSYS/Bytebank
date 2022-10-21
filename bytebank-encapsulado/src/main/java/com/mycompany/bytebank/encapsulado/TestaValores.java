/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.encapsulado;

/**
 *
 * @author Usuario
 */
public class TestaValores {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta(1337, 24226);
        
        System.out.println(conta.getAgencia());
        
        Conta conta2 = new Conta(1337, 16549);
        
        
        System.out.println(Conta.getTotal());
    }  
}
