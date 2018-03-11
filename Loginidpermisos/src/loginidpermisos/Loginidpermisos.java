/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginidpermisos;

import javax.swing.JOptionPane;

/**
 *
 * @author capacitacion
 */
public class Loginidpermisos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuarios[]= new String[8];
        int num_id[]= new int[8];
        int permisos[]= new int[8];
        int i;
        String texto;
        int id_2;
        boolean encontro=false;
        
        for (i=0; i<1; i++){
            texto=JOptionPane.showInputDialog("Ingrese su nombre de usuario");
            usuarios[i]=texto;
            
            texto=JOptionPane.showInputDialog("Ingrese un id");
            num_id[i]=Integer.parseInt(texto);
            
            texto=JOptionPane.showInputDialog("Ingrese su nivel de permiso");
            permisos[i]=Integer.parseInt(texto);
            
        } texto=JOptionPane.showInputDialog("Ingrese un id");
            id_2=Integer.parseInt(texto);
            
            for (i=0; i<1; i++){
                if (id_2==num_id[i]){
                    encontro=true;
                    System.out.println("Bienvenido al sistema "+usuarios[i]);
                        if (permisos[i]==0){
                            System.out.println ("Usted ni tiene permiso para ingresa");
                        }else if (permisos[i]==1){
                            System.out.println ("Usted tiene permisos limitados"); 
                        }else if(permisos[i]==2){
                            System.out.println ("Usted es administrador");
                        }    
                    
                }
            }
            if (encontro==false){
                    System.out.println("Usuario Incorrecto");
            }
             
            
        
      
        
        //for (i=0; i<3; i++){
         //System.out.println(usuarios [i]+num_id[i]+permisos[i]);
                 
        
    }
    
}
