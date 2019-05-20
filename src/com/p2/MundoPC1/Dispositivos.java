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
public class Dispositivos {
    private String tipoEntrada;
    private String marca;
    private final String tipoDeDispositivo;

    public Dispositivos(String tipoEntrada, String marca,String tipoDeDispositivo) {
        this.tipoEntrada = tipoEntrada;
        this.tipoDeDispositivo=tipoDeDispositivo;
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    
    @Override
    public String toString() {
        return "Dispositivo{"+ "tipoEntrada= " + tipoEntrada + ", marca= " + marca +" tipoDeDispositivo= "+tipoDeDispositivo+ '}';
    }   
}
