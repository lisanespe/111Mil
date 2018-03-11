/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.precios;

import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class ListaDePrecios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final float cocacola;
        cocacola = 45.30f;
        final float papaslays;
        papaslays = 35.00f;
        final float galletitasoreo;
        galletitasoreo = 19.90f;
        final float harina;
        harina = 29.90f;
        int cantidadcoca;
        int cantidadlays;
        int cantidadoreo;
        int cantidadharina;
        float totalcompra;
        Scanner s=new Scanner (System.in);
        System.out.println ("¿cuantas Coca Colas lleva?");
        cantidadcoca=s.nextInt();
        System.out.println ("¿cuantas Papas Lays lleva?");
        cantidadlays=s.nextInt();
        System.out.println ("¿cuantas Galletas Oreo lleva?");
        cantidadoreo=s.nextInt();
        System.out.println ("¿cuantas Harinas lleva?");
        cantidadharina=s.nextInt();
        totalcompra=((cantidadcoca*cocacola)+(cantidadlays*papaslays)+(cantidadoreo*galletitasoreo)+(cantidadharina*harina));
        System.out.println ("El precio final de su compra es: "+totalcompra);
        
        
              
                
        

        // TODO code application logic here
    }
    
}
