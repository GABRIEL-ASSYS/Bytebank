/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebankcomposto;

/**
 *
 * @author Usuario
 */
public class TestaSacaNegativo {
    
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        
        conta.deposita(100);
        System.out.println(conta.saca(101));
        
        conta.saca(101);
        
        System.out.println(conta.getSaldo());
    }
    
}
