/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Registro {
    private List<Contenido>listaContenido = new ArrayList<>();

    public Registro() {
    }

    public List<Contenido> getListaContenido() {
        return listaContenido;
    }

    public void setListaContenido(List<Contenido> listaContenido) {
        this.listaContenido = listaContenido;
    }

    @Override
    public String toString() {
        return "RegistroUsuariosyContenido{" + "listaContenido=" + listaContenido + '}';
    }
    
     
    
    public void agregarContenido(Contenido parContenido){
        listaContenido.add(parContenido);
        
    }
    
    public void listarContenido(){
        for(Contenido i : listaContenido){
            System.out.println(i.toString());
        }
    }
    
    public void mostrarTotalContenido(){
        System.out.println(listaContenido.size());
    }
            
}
