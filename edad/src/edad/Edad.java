/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner s=new Scanner (System.in);
        System.out.println ("ingrese su edad: ");
        edad=s.nextInt();
        System.out.println("usted tiene "+edad+" años");
        
        
        // TODO code application logic here
    }
    
}
