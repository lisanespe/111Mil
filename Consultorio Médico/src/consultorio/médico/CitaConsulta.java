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
public class CitaConsulta extends Cita{
    
    private String doctor;
    private String especialidad;
    

    public CitaConsulta(int hora, int sala, Paciente p,String doctor, String especialidad) {
        super(hora, sala, p);
        this.doctor = doctor;
        this.especialidad = especialidad;
    }


    
    

    
    
}
