/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherobuffunirarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*Crea una aplicación que pida la ruta y fichero de dos ficheros de texto y de una ruta de destino 
(solo la ruta, sin fichero al final). Debes copiar el contenido de los dos ficheros en uno, 
este tendrá el nombre de los dos ficheros separados por un guion bajo, este se guardara en 
la ruta donde le hayamos indicado por teclado.

Para unir los ficheros en uno, crea un método donde le pases como parámetro todas las rutas. 
En este método, aparte de copiar debe comprobar que si existe el fichero de destino, nos muestre 
un mensaje informándonos de si queremos sobrescribir el fichero. Te recomiendo usar la clase File 
y JOptionPane.

Por ejemplo, si tengo un fichero A.txt con “ABC” como contenido, un fichero B.txt con “DEF” y 
una ruta de destino D:\, el resultado sera un fichero llamado A_B.txt en la ruta D:\ con el 
contenido “ABCDEF”.

Puedes crear submétodos para realizar la copia de ficheros, piensa también como podrias optimizar 
esta copia, si los ficheros tuvieran mucho contenido.

Recuerda que debes controlar las excepciones que puedan aparecer. En caso de error, mostrar una 
ventana de dialogo con información del error.*/

//C:\Users\capacitacion\Desktop\A.txt

/**
 *
 * @author capacitacion
 */
public class Ficherobuffunirarchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String ruta=JOptionPane.showInputDialog("Ingrese la ruta del archivo");
            FileReader fr= new FileReader(ruta);
            BufferedReader br= new BufferedReader (fr);
            
            String ruta2=JOptionPane.showInputDialog("Ingrese la ruta del archivo");
            FileReader fr2= new FileReader(ruta2);
            BufferedReader br2= new BufferedReader (fr2);
            
            String ruta3=JOptionPane.showInputDialog("Ingrese la ruta del archivo final");
            String ruta3completa=ruta3+"\\A_B.txt";
            System.out.println(ruta3completa);
            FileWriter fw=new FileWriter(ruta3completa);//pensar esta ruta
            BufferedWriter bw= new BufferedWriter (fw);
            escribeFichero (br,br2,bw);
            
            }catch(IOException e){
            System.out.println("Error E/S: "+e);
                                                   
        }
        // TODO code application logic here
    }
    
    public static void escribeFichero(BufferedReader br, BufferedReader br2, BufferedWriter bw)throws IOException{
          
          String linea1=br.readLine();
          String linea2=br2.readLine(); 
          
          while((linea1!=null)||(linea2!=null)){
           String lineafinal=linea1+linea2;
            bw.write (lineafinal);
            bw.flush(); 
            System.out.println (lineafinal);
            linea1=br.readLine();
            linea2=br2.readLine();
              
              //bw.write(linea1fin);
            //  bw.flush();
              
          // () {
           //   bw.write(linea2fin);
             // bw.flush();
          }
          
           // String lineafinal=linea1fin+linea2fin;
           // bw.write (lineafinal);
           // bw.flush();
              
     }    
             
            
              
          
        
        
        
        
    


}
