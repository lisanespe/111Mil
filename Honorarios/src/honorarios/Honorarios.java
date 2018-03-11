/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package honorarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lisandro
 */
public class Honorarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Float smvym;
        String texto;
        float valorudr;
        int cant_udr;
        float montoensmvym;
        int resultadocierre;
        
              
        texto=JOptionPane.showInputDialog("Ingrese el valor actual del SMVYM");
        smvym=Float.parseFloat(texto);
        
        valorudr  = smvym / 100;
        
        texto=JOptionPane.showInputDialog("¿como fue el cierre? Ingrese la opción correcta: 1. Hubo acuerdo 2. No hubo acuedo/Una o las dos partes estuvieron incomparecientes 3. El requirente desistio");
        resultadocierre=Integer.parseInt(texto);
        
        if(resultadocierre==1){
            
        }else if (resultadocierre==2){
        
        }else{
            
        }
        
        
        
                
        
        
        // TODO code application logic here
    }
    
}
