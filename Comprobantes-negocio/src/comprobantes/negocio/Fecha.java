/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comprobantes.negocio;

/**
 *
 * @author Lau
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
    }
    

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
