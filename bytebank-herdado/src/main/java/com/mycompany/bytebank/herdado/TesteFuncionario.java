/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.herdado;

/**
 *
 * @author Usuario
 */
public class TesteFuncionario {
    
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente();
        
        Gerente nico = new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("223355646-9");
        nico.setSalario(2600.00);
        
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
        
        //nico.salario = 300.0;
    }
}
