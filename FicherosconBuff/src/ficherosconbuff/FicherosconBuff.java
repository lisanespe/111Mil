/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosconbuff;

import java.io.*;

/**
 *
 * @author Lau
 */
public class FicherosconBuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\111mil\\Desktop\\ejemplo.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\111mil\\Desktop\\ejemplo.txt"));){
            escribeFichero(bw);
            //Guardamos los cambios del fichero
            bw.flush();//fuerza a escribir y vacía el buffer
            leeFichero(br);
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    }
    public static void escribeFichero(BufferedWriter bw) throws IOException{
        //Escribimos en el fichero
        bw.write("Esto es una prueba usando Buffered");
        bw.newLine();
        bw.write("Seguimos usando Buffered");
    }
    public static void leeFichero(BufferedReader br) throws IOException{
        //Leemos el fichero y lo mostramos por pantalla
        String linea=br.readLine();
        while(linea!=null){
            System.out.println(linea);
            linea=br.readLine();        }
    }
    
}
