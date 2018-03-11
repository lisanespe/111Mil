/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lisandro.descuento;

/**
 *
 * @author capacitacion
 */
public class LisandroDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio1;
        double precio2;
        double descuento1;
        double descuento2;
        double preciototal;
        precio1=120.0;
        precio2=80.0;
        descuento1=0.95;
        descuento2=0.90;
        preciototal=precio1*descuento1+precio2*descuento2;
        System.out.println ("el precio total con descuento " +preciototal);
        // TODO code application logic here
    }
    
}
