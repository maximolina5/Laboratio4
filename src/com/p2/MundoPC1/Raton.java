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
public class Raton extends Dispositivos {
    private int idRaton;
    private static int contadorRaton;

    public Raton( String tipoEntrada, String marca, String tipoDeEntrada) {
        super(tipoEntrada, marca,tipoDeEntrada);
        this.idRaton=++contadorRaton;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public void setContadorRaton(int contadorRaton) {
        this.contadorRaton = contadorRaton;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
