/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcular.vocales;

/**
 *
 * @author 111mil
 */
public class vocales {
    
    private String oracion;
    private char letra;
    private int vocal=0;

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion.toLowerCase();
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getVocal() {
        return vocal;
    }

    public void setVocal() {
        this.vocal = vocal;
        for(int i=0;i<oracion.length();i++){
            letra=oracion.charAt(i);
            if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'){
                vocal++;
            }
        }
    }   
}
