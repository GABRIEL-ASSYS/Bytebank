/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.herdado;

/**
 *
 * @author Usuario
 */
public class TesteSistema {

    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);
        
        Cliente cliente = new Cliente();
        cliente.setSenha(2222);
        
        Administrador adm = new Administrador();
        adm.setSenha(3333);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
    }
}
