/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.médico;

import java.util.Date;

/**
 *
 * @author capacitacion
 */
public class CitaPrueba extends Cita {
    double tiempoest;
    Prueba pr;
    
    

    public CitaPrueba(int hora, int sala, Paciente p, double tiempoest, Prueba pr) {
        super(hora,sala,p);
        this.tiempoest = tiempoest;
        this.pr = pr;
    }

    public double getTiempoest() {
        return tiempoest;
    }

    public void setTiempoest(double tiempoest) {
        this.tiempoest = tiempoest;
    }

    public Prueba getPr() {
        return pr;
    }

    public void setPr(Prueba pr) {
        this.pr = pr;
    }
    
    

    
}
