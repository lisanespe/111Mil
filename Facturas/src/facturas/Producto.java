/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturas;

/**
 *
 * @author capacitacion
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private float precio;

    public Producto(int codigo, String descripcion, float precio) {
        setCodigo (codigo);
        setDescripcion (descripcion);
        setPrecio (precio);
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
    
}
