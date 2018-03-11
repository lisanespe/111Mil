/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas.nombres.conceptos;

import javax.swing.JOptionPane;

/**
 *
 * @author capacitacion
 */
public class NotasNombresConceptos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre[]= new String[10];
        float notas[]= new float[10];
        String concepto[]= new String[10];
        int i;
        String texto;
        
         for (i=0; i<1; i++){
            texto=JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            nombre[i]=texto;
            
            texto=JOptionPane.showInputDialog("Ingrese la nota del alumno");
            notas[i]=Float.parseFloat(texto);
            
            if (notas[i]>=0 && notas[i]<=4.99){
                concepto[i]= "mala";
            }else if (notas[i]>=5 && notas[i]<=6.99)
                concepto[i]= "Bien";
            else if (notas[i]>=7 && notas[i]<=8.99)
                concepto[i]= "Notable";
            else if (notas[i]>=9 && notas[i]<=10)
                concepto[i]= "Sobresaliente";
            }
         
         for (i=0; i<1; i++){
             System.out.println("El alumno "+nombre[i]+" saco un " + notas[i]+" su concepto es "+concepto[i]);
         }
        
    
        
        
    }
    
}
