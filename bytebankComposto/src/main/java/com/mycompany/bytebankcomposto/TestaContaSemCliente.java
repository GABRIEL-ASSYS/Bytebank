/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebankcomposto;

/**
 *
 * @author Usuario
 */
public class TestaContaSemCliente {
    
    public static void main(String[] args) {
        
        Conta contaDaMarcela = new Conta();
        
        System.out.println(contaDaMarcela.getSaldo());
        
        contaDaMarcela.titular = new Cliente(); 
        System.out.println(contaDaMarcela.titular);
        
        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome);
        
    }
    
}
