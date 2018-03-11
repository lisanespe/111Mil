/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.médico;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author capacitacion
 */
public class Cita {
    
    private Date fecha;
    private int hora;
    private int sala;
    private Paciente p;

    public Cita() {
    }
    
    

    public Cita(int hora, int sala, Paciente p) {
        this.fecha = new Date();
        this.hora = hora;
        this.sala = sala;
        this.p = p;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Paciente getP() {
        return p;
    }

    public void setP(Paciente p) {
        this.p = p;
    }
    
 public String toString(){
    return "Cita {" + "fecha=" + DateFormat.getDateInstance().format (fecha) + ",hora=" + hora + ", sala " + sala + " Paciente= " + p + "}";
   
 }

 

}