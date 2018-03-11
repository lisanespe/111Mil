/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacionclase;

import java.util.Scanner;

/**
 *
 * @author 111mil
 */
public class ConcatenacionClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String oracion;
        String palabra;
        int i;
        oracion="";
        Scanner s=new Scanner (System.in);
        Concatenador c=new Concatenador();
        for(i=0;i<4;i++){
            System.out.println("Ingrese una palabra para concatenar:");
            palabra=s.next();
            c.setPalabra(palabra);
            c.setOracion(oracion);
            oracion=c.getOracion();
        }//fin for
        System.out.println(oracion);
    } 
}
