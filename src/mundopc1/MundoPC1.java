/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc1;

import com.p2.MundoPC1.Monitor;
import com.p2.MundoPC1.Orden;
import com.p2.MundoPC1.Raton;
import com.p2.MundoPC1.Teclado;
import com.p2.MundoPC1.Computadora;
import com.p2.MundoPC1.Parlante;

/**
 *
 * @author maxim
 */
public class MundoPC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teclado t1 = new Teclado("USB","Inova","Entrada");
        Teclado t2 = new Teclado("USB","Samsung","Entrada");
        Teclado t3 = new Teclado("USB","Kolke","Entrada");
        Teclado t4 = new Teclado("USB","Genius","Entrada");
        Teclado t5 = new Teclado("PS/2","LG","Entrada");
        
        Raton r1 = new Raton ("USB","Genius","Entrada");
        Raton r2 = new Raton ("USB","LG","Entrada");
        Raton r3 = new Raton ("USB","Kolke","Entrada");
        Raton r4 = new Raton ("USB","Logitec","Entrada");
        Raton r5 = new Raton ("USB","Corsair","Entrada");
        
        Monitor m1 = new Monitor("Lg",15.0);
        Monitor m2 = new Monitor("Samsung",21.0);
        Monitor m3 = new Monitor("HP",18.0);
        Monitor m4 = new Monitor("Acer",24.0);
        Monitor m5 = new Monitor("Zowie",15.0);
        
        Parlante p1 = new Parlante("3,5","Lg","Salida");
        Parlante p2 = new Parlante("USB","Genius","Salida");
        Parlante p3 = new Parlante("Jack audio","Corsair","Salida");
        Parlante p4 = new Parlante("Optica audio","Kolke","Salida");
        Parlante p5 = new Parlante("3,5","Inova","Salida");
        
        Computadora c1 = new Computadora("Pc1",m1,t1,r1,p1,40000.00);
        Computadora c2 = new Computadora("Pc2",m2,t2,r2,p2,50000.00);
        Computadora c3 = new Computadora("Pc3",m3,t3,r3,p3,60000.00);
        Computadora c4 = new Computadora("Pc4",m4,t4,r4,p4,70000.00);
        Computadora c5 = new Computadora("Pc5",m5,t5,r5,p5,48000.00);
        Computadora c6 = new Computadora("pc6",m5,t4,r3,p4,50000.00);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadoras(c1);
        orden1.mostrarOrden();
        System.out.println();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadoras(c2);
        orden2.mostrarOrden();
        System.out.println();
        
        Orden orden3 = new Orden();
        orden3.agregarComputadoras(c3);
        orden3.mostrarOrden();
        System.out.println();
        
        Orden orden4 = new Orden();
        orden4.agregarComputadoras(c4);
        orden4.mostrarOrden();
        System.out.println();
        
        Orden orden5 = new Orden();
        orden5.agregarComputadoras(c5);
        orden5.mostrarOrden();
        System.out.println();
    }
    
}
