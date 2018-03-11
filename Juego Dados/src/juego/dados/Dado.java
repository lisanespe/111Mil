/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego.dados;

/**
 *
 * @author capacitacion
 */
public class Dado {
    private int resultado;
 
    public int getResultado() {
        return resultado;
    }

    public void setResultado() {
        this.resultado = (int)Math.floor(Math.random()*(6-1+1)+(1));
    }


    
        
    
    
    
    
    
}
