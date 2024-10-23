/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Serie extends Contenido implements IReglas {
    private int temporadas;
    private boolean finalizadas;

    public Serie() {
    }

    public Serie(int temporadas, boolean finalizadas) {
        this.temporadas = temporadas;
        this.finalizadas = finalizadas;
    }

    public Serie(int temporadas, boolean finalizadas, String codigoUnico, String nombre, String nombreUsuario) {
        super(codigoUnico, nombre, nombreUsuario);
        this.temporadas = temporadas;
        this.finalizadas = finalizadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isFinalizadas() {
        return finalizadas;
    }

    public void setFinalizadas(boolean finalizadas) {
        this.finalizadas = finalizadas;
    }

    @Override
    public String toString() {
        return "Serie{" + "temporadas=" + temporadas + ", finalizadas=" + finalizadas + '}';
    }

    

    

    @Override
    public void mostrarContenido(){
        System.out.println("ID: " + getCodigoUnico() + " NOMBRE: " + getNombre() + " TEMPORADAS: " + getTemporadas() +
                            " SERIE AGREGADA POR EL USUARIO: " + getNombreUsuario());
    }
    
    @Override
    public void calcularCostoMensualSuscripcion(){
        System.out.println("Suscripcion usuario: " + getNombreUsuario());
        double total = COSTO_BASE_SUSCRIPCION;
        if(getTemporadas() > 3){
            total = COSTO_BASE_SUSCRIPCION * 1.08;
            System.out.println(total);
        }else{
            System.out.println(total);
        }            
        
    }
    
    
}
