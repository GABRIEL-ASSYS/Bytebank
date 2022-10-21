/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebankcomposto;

/**
 *
 * @author Usuario
 */
public class TestaBanco {
    
    public static void main(String[] args) {
        
        Cliente paulo = new Cliente();
        
        paulo.nome = "Paulo Silveira";
        paulo.cpf = "222.222.222-22";
        paulo.profissao = "programador";
        
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.deposita(100);
        
        contaDoPaulo.titular = paulo;
        System.out.println(contaDoPaulo.titular.nome);
        System.out.println(contaDoPaulo.titular);
        System.out.println(paulo);
    }
    
}
