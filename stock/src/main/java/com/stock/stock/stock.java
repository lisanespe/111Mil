/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock.stock;

import Modelo.Producto;
import java.util.ArrayList;

/**
 *
 * @author Lisandro
 */
public class stock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList producto=new ArrayList();
        
        Producto p=new Producto(7,"Compas",30,0.50);
        Producto p2=new Producto(8,"Resma",15,5.0);
        Producto p3=new Producto(9,"Teclado",40,3.50);
        Producto p4=new Producto(10,"Mouse",30,1.50);
        
        producto.add(p);
        producto.add(p2);
        producto.add(p3);
        producto.add(p4);
        
        System.out.println(producto);
        
        //producto.toString();
    }
    
}
