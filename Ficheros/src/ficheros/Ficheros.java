/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Scanner s=new Scanner (System.in);
        String linea;
        
        
        try {
         //Abro el stream, crea el fichero si no existe
         FileWriter fw=new FileWriter("C:\\Users\\capacitacion\\Desktop\\fichero1.txt");//true no se sobrescribe (false por defecto)
         //Escribimos en el fichero un String
         //fw.write("Esto es una linea de código\n");
           for (i=0;i<4;i++){
               System.out.println ("Ingrese una linea de texto");
               linea = s.nextLine();
               fw.write(linea+"\n"); 
               
           }
         
         //cierro el Stream
         fw.close();
         //Abro el stream, el fichero debe existir
         FileReader fr=new FileReader("C:\\Users\\capacitacion\\Desktop\\fichero1.txt");
         //Leemos el fichero y lo mostramos por pantalla
         int valor=fr.read();
         while(valor!=-1){
            System.out.print((char)valor);
            valor=fr.read();
        }
        //Cerramos el stream
        fr.close(); 
        
        }catch (IOException e){
                System.out.println ("Error E/S: "+e);
        
        }
        // TODO code application logic here
    }
    
}
