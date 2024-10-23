/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Pelicula extends Contenido implements IReglas{
    private int duracionEnMinutos;
    private double calificacion;

    public Pelicula() {
    }

    public Pelicula(int duracionEnMinutos, double calificacion) {
        this.duracionEnMinutos = duracionEnMinutos;
        this.calificacion = calificacion;
    }

    public Pelicula(int duracionEnMinutos, double calificacion, String codigoUnico, String nombre, String nombreUsuario) {
        super(codigoUnico, nombre, nombreUsuario);
        this.duracionEnMinutos = duracionEnMinutos;
        this.calificacion = calificacion;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "duracionEnMinutos=" + duracionEnMinutos + ", calificacion=" + calificacion + '}';
    }

    

    
    
   
    
    @Override
    public void mostrarContenido(){
        System.out.println("ID: " + getCodigoUnico() + " NOMBRE: " + getNombre() + "DURACION: " + getDuracionEnMinutos() +
                            " CALIFICACION: " + getCalificacion() + " PELICULA AGREGADA POR EL USUARIO: " + getNombreUsuario());
    }
    
    
    @Override
    public void calcularCostoMensualSuscripcion(){
        System.out.println("Suscripcion usuario: " + getNombreUsuario());
        double total = COSTO_BASE_SUSCRIPCION;
        if(getCalificacion() > 4.5){
            total = COSTO_BASE_SUSCRIPCION * 1.10;
            System.out.println(total);
        }else{
            System.out.println(total);
        }
        
    }
         
}
