/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concatenacionclase;

import java.util.Scanner;

/**
 *
 * @author capacitacion
 */
public class Concatenador {

    /**
     * @param args the command line arguments
     */
    private String palabra;
    private String oracion;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
        if (this.oracion.isEmpty()){
               this.oracion=palabra;
    }else{
            this.oracion=this.oracion.concat(" "+ palabra);
            
    }//fin if   
    
 }
}