/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.herdado;

/**
 *
 * @author Usuario
 */
public class TesteDeReferencias {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente();
        
        g1.setNome("Marcos");
        g1.setSalario(5000.00);
        
        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);
        
        Designer d = new Designer();
        d.setSalario(2500.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);
        
        System.out.println(controle.getSoma());
    }
}
