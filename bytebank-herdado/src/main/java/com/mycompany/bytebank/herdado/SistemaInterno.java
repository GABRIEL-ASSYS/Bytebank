/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.herdado;

/**
 *
 * @author Usuario
 */
public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if (autenticou) {
            System.out.println(" Pode entrar no sistema! ");
        } else {
            System.out.println(" Não pode entrar no sistema! ");
        }
    }
    }
