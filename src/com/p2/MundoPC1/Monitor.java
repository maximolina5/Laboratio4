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
public class Monitor {
    private int idMonitor;
    
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    public Monitor() {
        
    }

    public Monitor(String marca, double tamaño) {
        this.marca = marca;
        this.tamanio = tamaño;
        this.idMonitor=++contadorMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamanio;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

    public int getIdMonitor() {
        return idMonitor;
    }
    
    
    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamanio + '}';
    }

    
    
    
    
}
