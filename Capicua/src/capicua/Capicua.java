/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capicua;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author capacitacion
 */
public class Capicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numeroIngresado;
        int cantDig;
        int i;
        int j;
        int cant_iguales=0;
        numeroIngresado=JOptionPane.showInputDialog("Introducir un numero de 5 digitos");
              
        int ListaInicial[]=new int [numeroIngresado.length()];
        int ListaInvertida[]=new int [numeroIngresado.length()];      
        
        for(i=0;i<ListaInicial.length;i++){
            ListaInicial[i]=Character.getNumericValue(numeroIngresado.charAt(i));
        }
        for(i=ListaInicial.length-1,j=0;i>=0;i--,j++){
            ListaInvertida[j]=ListaInicial[i];
       }
       if(Arrays.equals(ListaInicial,ListaInvertida)){
             
            JOptionPane.showMessageDialog(null,"El numero: " + numeroIngresado+ " es Capicua");
        }else{    
            JOptionPane.showMessageDialog(null,"El numero: " + numeroIngresado+ " no es Capicua");
        }     
        
    
     

        }
        
    }
    
     