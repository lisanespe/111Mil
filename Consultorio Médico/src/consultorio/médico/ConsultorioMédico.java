/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.médico;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.text.DateFormat;
import java.util.Iterator;
import javax.swing.JOptionPane;


/**
 *
 * @author capacitacion
 */
public class ConsultorioMédico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Cita> citas = new ArrayList<>();
        Paciente p= new Paciente ("Juan Perez", "M", 205482015);
        Paciente p2= new Paciente ("Espejo Lisandro", "M", 205554841);
        Prueba pr = new Prueba (005, "Ecocardiograma");
        Prueba pr2 = new Prueba (005, "Electrocardiograma");
        CitaConsulta cc = new CitaConsulta(5, 1, p, "Juan Carlos Gonzalez", "Cardiologo");
        CitaConsulta cc2 = new CitaConsulta(5, 1, p2, "Pedro Gonzalez", "Cardiologo");
        CitaPrueba cp = new CitaPrueba(5, 2, p, 1.30, pr);
        CitaPrueba cp2 = new CitaPrueba(3, 4, p2, 0.30, pr2);
        
        String ruta=JOptionPane.showInputDialog("Ingrese la opción deseada: 1. Cargar una nueva cita de consulta 2. Cargar una cita de prueba 3. Listar citas pendientes 4. Cargar nuevo paciente 5. Listar pacientes 6. Cargar nuevo profesional 7. Listar profesionales");
       
        Switch (menu)
        
        
        
        
        
        
        CargarArray(citas, cp, cc);
        Escribirenarchivo(citas);
        LeerArchivo();
        BorrarArray(citas);
        
    
            
    //System.out.println(cc);
    //System.out.println(cp);
   //System.out.println(citas);
    }   





public static void Escribirenarchivo(ArrayList<Cita> citas){
    
    
    try {
             FileWriter fw=new FileWriter("C:\\Users\\capacitacion\\Desktop\\citas.txt",true);
             BufferedWriter bw=new BufferedWriter(fw);
             
          
           
             
        for(Cita c:citas){
            bw.write(c.toString());
            bw.newLine();
            bw.flush();
        }
    bw.close();
    fw.close();    
        
        }catch (IOException e){
                System.out.println ("Error E/S: "+e);
        
        }
}

public static void LeerArchivo (){
    
    try { 
        FileReader fr= new FileReader ("C:\\Users\\capacitacion\\Desktop\\citas.txt"); 
        BufferedReader br = new BufferedReader (fr);
        
        String linea=br.readLine();
         System.out.println ("Citas pendientes: "); 
        while(linea!=null){
            System.out.println(linea);
            linea=br.readLine();        
        }
        br.close();
        fr.close();
    
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        }
    
    
    
}

public static void CargarArray (ArrayList<Cita> citas, CitaPrueba cp, CitaConsulta cc){
        citas.add(cc);
        citas.add(cp);
    
    
    
    
}

public static void BorrarArray(ArrayList<Cita> citas){ 
        Iterator<Cita> ct= citas.iterator();
             while(ct.hasNext()){
                citas.remove(0);
             }
}

}//fin clase

