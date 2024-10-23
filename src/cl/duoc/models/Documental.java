/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Documental extends Contenido implements IReglas{
    private String enfoqueEducativo;
    private double duracionEnMinutos;

    public Documental() {
    }

    public Documental(String enfoqueEducativo, double duracionEnMinutos) {
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public Documental(String enfoqueEducativo, double duracionEnMinutos, String codigoUnico, String nombre, String nombreUsuario) {
        super(codigoUnico, nombre, nombreUsuario);
        this.enfoqueEducativo = enfoqueEducativo;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getEnfoqueEducativo() {
        return enfoqueEducativo;
    }

    public void setEnfoqueEducativo(String enfoqueEducativo) {
        this.enfoqueEducativo = enfoqueEducativo;
    }

    public double getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(double duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public String toString() {
        return "Documental{" + "enfoqueEducativo=" + enfoqueEducativo + ", duracionEnMinutos=" + duracionEnMinutos + '}';
    }

    
    
    
    @Override
    public void mostrarContenido(){
        System.out.println("ID: " + getCodigoUnico() + " NOMBRE: " + getNombre() + " ENFOQUE EDUCATIVO: " + getEnfoqueEducativo() +
                            " DURACION: " + getDuracionEnMinutos() + " DOCUMENTAL AGREGADO POR EL USUARIO: " + getNombreUsuario());
    }
    
    @Override
    public void calcularCostoMensualSuscripcion(){
        System.out.println("Suscripcion usuario: " + getNombreUsuario());
        double total = COSTO_BASE_SUSCRIPCION;
        if(getDuracionEnMinutos() > 90){
            total = COSTO_BASE_SUSCRIPCION * 0.95;
            System.out.println(total);
        }else{
            System.out.println(total);
        }
        
    }
}
