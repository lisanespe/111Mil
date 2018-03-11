/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosbylucas;

/**
 *
 * @author capacitacion
 */
public class Calculadora {
    private float uno;
    private float dos;
    private float suma;
    private float resta;
    private float multiplicacion;
    private float division;
    
    public float getUno() {
        return uno;
    }

    public void setUno(float uno) {
        this.uno = uno;
    }

    public float getDos() {
        return dos;
    }

    public void setDos(float dos) {
        this.dos = dos;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma() {
        this.suma =(uno+dos);

    }
    
    public float getResta() {
        return resta;
    }

    public void setResta() {
        this.resta =(uno-dos);

    }
    
      public float getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion() {
        this.multiplicacion =(uno*dos);

    }
    
      public float getDivision() {
        return division;
    }

    public void setDivision() {
        this.division =(uno/dos);

    }
}
