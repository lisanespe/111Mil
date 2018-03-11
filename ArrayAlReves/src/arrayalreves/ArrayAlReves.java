/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayalreves;

/**
 *
 * @author capacitacion
 */
public class ArrayAlReves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] Lista1={1,2,3,4,5};
        int Lista2[]= new int [Lista1.length];
        int i,j;
        
        for(i=Lista1.length-1,j=0;i>=0;i--,j++){
        Lista2[j]=Lista1[i];
        System.out.println("Lista1 Posicion: "+i+"="+Lista1[i] +  " Lista2 Posicion: "+j+  "="+Lista2[j]);
        }
        
    }
    
}
