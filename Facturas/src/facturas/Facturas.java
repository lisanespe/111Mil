/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas;

import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class Facturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        Fecha hoy=new Fecha(4,8,2017);
        Producto produc1=new Producto(1,"Cafe", (float) 8.5);
        Producto produc2=new Producto(2, "Medialuna", 10);
        Producto produc3=new Producto (3, "Medialuna", 10);
        Cliente cli=new Cliente(1, "Juan Carlos Perez");
        Factura f1=new Factura ('A', 1, hoy, cli);
        //f1.agregarproducto(produc3);
        //f1.agregarproducto(produc2);
        //f1.agregarproducto(produc1);
        f1.mostrar();
        f1.mostrarProductos();
       
        
                
       // System.out.println("Introduzca fecha de la factura");
        
       
        
        
        
        


        //fecha
        //productos
        //
        
       
    }
    
}
