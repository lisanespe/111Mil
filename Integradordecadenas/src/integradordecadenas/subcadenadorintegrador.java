/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradordecadenas;

/**
 *
 * @author 111mil
 */
public class subcadenadorintegrador{
    
    private String palabra;
    private String subcadena;
    private int inicio, fin;

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getSubcadena() {
        return subcadena;
    }

    public void setSubcadena() {
        this.subcadena = palabra.substring(inicio,fin);
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
}
