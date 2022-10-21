/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.herdado;

/**
 *
 * @author Usuario
 */
public class TesteGerente {
    
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Marcos");
        g1.setCpf("235568413");
        g1.setSalario(5000.0);
        
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        
//        g1.setSenha(2222);
//        boolean autenticou = g1.autentica(2222);
        
        //System.out.println(autenticou);
        System.out.println(g1.getBonificacao());
    }
}
