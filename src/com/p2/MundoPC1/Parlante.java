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
public class Parlante extends Dispositivos {
    private final int idParlante;
    private static int contadorParlante;

    public Parlante(String tipoEntrada, String marca, String tipoDeEntrada) {
        super(tipoEntrada, marca,tipoDeEntrada);
        this.idParlante=++contadorParlante;
    }

    public int getIdParlante() {
        return idParlante;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
       
}
