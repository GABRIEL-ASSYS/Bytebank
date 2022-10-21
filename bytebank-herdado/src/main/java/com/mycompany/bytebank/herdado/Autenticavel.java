/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bytebank.herdado;

/**
 *
 * @author Usuario
 */

//contrato Autenticavel 
    //quem assina esse contrato precisa implementar 
        //método setSenha
        //método autentica
public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
