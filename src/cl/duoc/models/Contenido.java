/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Contenido implements IReglas{
    private String codigoUnico;
    private String nombre;
    private String nombreUsuario;

    public Contenido() {
    }

    public Contenido(String codigoUnico, String nombre, String nombreUsuario) {
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
    }

    public String getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String toString() {
        return "Contenido{" + "codigoUnico=" + codigoUnico + ", nombre=" + nombre + ", nombreUsuario=" + nombreUsuario + '}';
    }

    

    

    
    public abstract void mostrarContenido();
    
}
