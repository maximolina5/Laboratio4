/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.p2.MundoPC1;

/**
 *
 * @author maxim
 */
public class Teclado extends Dispositivos{
    private int idTeclado;
    private int contadorTeclado;

    public Teclado(String tipoEntrada, String marca, String tipoDeEntrada) {
        super(tipoEntrada, marca,tipoDeEntrada);
        this.idTeclado=++contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
