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
public class Paciente {
    String nombre;
    String sexo;
    long num_afiliado;

    public Paciente(String nombre, String sexo, long num_afiliado) {
        this.nombre = nombre;
        this.num_afiliado = num_afiliado;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getNum_afiliado() {
        return num_afiliado;
    }

    public void setNum_afiliado(long num_afiliado) {
        this.num_afiliado = num_afiliado;
    }
    
    
 public String toString(){
        return nombre + " " + sexo + " " + num_afiliado;  
    
 }    
}
