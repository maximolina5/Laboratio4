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
public class Computadora {
    private int idComputadora;
    private static int contadorComputadoras;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private Parlante parlante;
    private double precio;

    private Computadora() {
         
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton,Parlante parlante, double precio) {
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
        this.precio = precio;
        this.parlante=parlante;
        this.idComputadora=++contadorComputadoras;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public String toString() {
        return "computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre +"\n"+"monitor= " + monitor +"\n"+ "teclado= " + teclado +"\n"+"raton= " + raton +"\n"+"Parlante= " +parlante+"\n"+"precio= " + precio + '}';
    }
    
    

    
    
}

    

