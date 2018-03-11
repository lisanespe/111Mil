/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros2;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author capacitacion
 */
public class Ficheros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String palabra="";
        ArrayList<String> lista= new ArrayList<>();
                
        
        try {
             FileReader fr=new FileReader ("C:\\Users\\capacitacion\\Desktop\\file.txt");
             
        int valor=fr.read();
        while(valor!=-1){
            if (valor!=32){ //no lee espacios
                palabra=palabra+((char)valor); 
            }else{
                lista.add(palabra);
                palabra="";
            }
            // System.out.print(palabra+"\n");
            
         valor=fr.read();//pide que se lea el siguiente caracter 
        }
        lista.add(palabra);
        Iterator<String> it=lista.iterator();
        String pal;
        while(it.hasNext()){
            pal=it.next();
            System.out.println(pal);
        }
    
        }catch (IOException e){
                System.out.println ("Error E/S: "+e);
    
}
    }
}

    