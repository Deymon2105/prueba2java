/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaregistrousuarios;

import cl.duoc.models.Documental;
import cl.duoc.models.Pelicula;
import cl.duoc.models.Registro;
import cl.duoc.models.Serie;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class SistemaRegistroUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Registro nuevoRegistro = new Registro();
        Pelicula pelicula2 = new Pelicula(90, 8.5, "PO2", "Rapido y furiosos", "Pedro");
        Pelicula pelicula3 = new Pelicula(120, 10, "P03", "Scarface", "Carlos");
        nuevoRegistro.agregarContenido(pelicula2);
        nuevoRegistro.agregarContenido(pelicula3);
        
        Serie serie2 = new Serie(4, true, "SR02", "La casa de papel", "Juancito");
        nuevoRegistro.agregarContenido(serie2);
        
        Documental doc2 = new Documental("Aprendizaje animales", 100, "DOC02", "Animales de la selva", "Juan");
        nuevoRegistro.agregarContenido(doc2);
        Documental doc3 = new Documental("Historia", 120, "DOC03", "Segunda guerra mundial", "pepito");
        
        int opcion = 0;
        while(opcion != 7){
            System.out.println("=====STREAMFLEX=====");
            System.out.println("1-Agregar pelicula");
            System.out.println("2-Agregar serie");
            System.out.println("3-Agregar documental");
            System.out.println("4-Listar el contenido disponible");
            System.out.println("5-Mostrar la cantidad total de contenido");
            System.out.println("6-Mostrar costo mensual de suscripcion de algunos clientes");
            System.out.println("7-Salir");
            System.out.println("Ingrese una opcion ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("===Agregar pelicula===");
                    Pelicula pelicula1 = new Pelicula();
                    System.out.println("Ingrese el codigo de la pelicula:");
                    pelicula1.setCodigoUnico(entrada.next());
                    System.out.println("Ingrese el nombre de la pelicula");
                    pelicula1.setNombre(entrada.next());
                    System.out.println("Ingrese la duracion en minutos de la pelicula");
                    pelicula1.setDuracionEnMinutos(entrada.nextInt());
                    System.out.println("Ingrese la calificacion de la pelicula");
                    pelicula1.setCalificacion(entrada.nextDouble());
                    System.out.println("Ingrese su nombre de usuario");
                    pelicula1.setNombreUsuario(entrada.next());
                    nuevoRegistro.agregarContenido(pelicula1);
                    pelicula1.mostrarContenido();
                    break;
                case 2:
                    System.out.println("===Agregar serie===");
                    Serie serie1 = new Serie();
                    System.out.println("Ingrese el codigo de la serie:");
                    serie1.setCodigoUnico(entrada.next());
                    System.out.println("Ingrese el nombre de la serie");
                    serie1.setNombre(entrada.next());
                    System.out.println("Ingrese las temporadas de la serie ");
                    serie1.setTemporadas(entrada.nextInt());
                    System.out.println("¿Las temporadas estan finalizadas?");
                    serie1.setFinalizadas(entrada.nextBoolean());
                    System.out.println("Ingrese el nombre de usuario");
                    serie1.setNombreUsuario(entrada.next());
                    nuevoRegistro.agregarContenido(serie1);
                    serie1.mostrarContenido();
                    break;
                case 3:
                    System.out.println("===Agregar documental===");
                    Documental doc1 = new Documental();
                    System.out.println("Ingrese el codigo del documental:");
                    doc1.setCodigoUnico(entrada.next());
                    System.out.println("Ingrese el nombre del documental");
                    doc1.setNombre(entrada.next());
                    System.out.println("Ingrese el enfoque educativo ");
                    doc1.setEnfoqueEducativo(entrada.next());
                    System.out.println("Ingrese la duracion del documental en minutos");
                    doc1.setDuracionEnMinutos(entrada.nextInt());
                    System.out.println("Ingrese el nombre de usuario");
                    doc1.setNombreUsuario(entrada.next());
                    nuevoRegistro.agregarContenido(doc1);
                    doc1.mostrarContenido();
                    break;
                case 4:
                    System.out.println("===Contenido disponible===");
                    nuevoRegistro.listarContenido();
                    break;
                case 5:
                    System.out.println("===Contenido existente en la plataforma===");
                    nuevoRegistro.mostrarTotalContenido();
                    break;
                case 6:
                    System.out.println("===Suscripciones mensuales===");
                    pelicula2.calcularCostoMensualSuscripcion();
                    pelicula3.calcularCostoMensualSuscripcion();
                    serie2.calcularCostoMensualSuscripcion();
                    doc2.calcularCostoMensualSuscripcion();
                    doc3.calcularCostoMensualSuscripcion();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
                    
            }
        }
    }
    
    
}
