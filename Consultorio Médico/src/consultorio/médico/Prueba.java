/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.médico;

/**
 *
 * @author capacitacion
 */
public class Prueba {
    int referencia;
    String resultado;

    public Prueba(int referencia, String resultado) {
        this.referencia = referencia;
        this.resultado = resultado;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
   
 public String toString(){
    return "Estudio referencia " + referencia + "Resultado: " + resultado;    
}
 
}