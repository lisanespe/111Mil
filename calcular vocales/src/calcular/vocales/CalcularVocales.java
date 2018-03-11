/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular.vocales;
import java.util.Scanner;


/**
 *
 * @author 111mil
 */
public class CalcularVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String oracion;
        int vocal;
        char letra;
        Scanner s = new Scanner (System.in);
        vocales v= new vocales();
        System.out.println("Introduzca una oración");
        oracion = s.nextLine ();
        v.setOracion(oracion);
        v.setVocal();
        vocal=v.getVocal();
        System.out.println("La oración tiene "+vocal+" vocales");
        
        
    
}
}