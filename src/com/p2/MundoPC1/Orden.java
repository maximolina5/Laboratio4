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
public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=10;
    

    public Orden() {
        this.idOrden=++contadorOrden;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
        
    }

    public void agregarComputadoras(Computadora Computadoras) {
    if(contadorComputadoras<MAX_COMPUTADORAS){
        this.computadoras[contadorComputadoras++] = Computadoras;
    }else{
        System.out.println("Se ha superado el maximo de computadoras por orden, El maximo es: "+MAX_COMPUTADORAS);
    }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            total+=computadoras[i].getPrecio();
        }
       return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #:"+ idOrden);
        System.out.println("Total de la orden #"+ idOrden+ ": $"+ calcularTotal());
        System.out.println("Productos de la orden #"+ idOrden+ ":"+"\t");
      
        for(int i=0;i<contadorComputadoras;i++){
           System.out.println(computadoras[i]);}
    }
    public static void setContadorOrdenes(int contadorOrdenes) {
        Orden.contadorOrden = contadorOrden;
    }


    public int getIdOrden() {
        return idOrden;
    }

    public int getContadorOrden() {
        return contadorOrden;
    }

//    public void setContadorOrden(int contadorOrden) {
//        this.contadorOrden = contadorOrden;
//    }

    public void setContadorComputadoras(int contadorComputadoras) {
        this.contadorComputadoras = contadorComputadoras;
    }
    

    public int getMAX_COMPUTADORAS() {
        return MAX_COMPUTADORAS;
    }

//    public void setMAX_COMPUTADORAS(int MAX_COMPUTADORAS) {
//        this.MAX_COMPUTADORAS = MAX_COMPUTADORAS;
//    }

    public void setComputadoras(Computadora[] computadoras) {
        this.computadoras = computadoras;
    }

    @Override
    public String toString() {
        return "Orden{" + "idOrden=" + idOrden + ", computadoras=" + computadoras + ", contadorComputadoras=" + contadorComputadoras + ", MAX_COMPUTADORAS=" + MAX_COMPUTADORAS + '}';
    }
    
    
}
