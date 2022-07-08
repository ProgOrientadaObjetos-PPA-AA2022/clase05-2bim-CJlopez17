/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public void establecerPromedioEdadesCualitativo(){
        if(promedioEdades >= 0 && promedioEdades <= 21){
            promedioEdadesCualitativo = "Promeido jovenes";
        }else{
            if(promedioEdades > 21){
                promedioEdadesCualitativo = "Promedio adultos";
            }
        }
    }
    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    
    public String obtenerPromedioEdadesCualitativo(){
        return promedioEdadesCualitativo;
    }

    @Override
    public String toString() {
        String cadena = String.format("Estudiante XD");

        for (Persona w : obtenerEstudiante()) {
            cadena = String.format("%s Nombre: %s\n", cadena, w.obtenerNombre());
        }
        cadena = String.format("%sPromedio edades: %.2f\n"
                + "Promedio Cualitatico: %s\n", cadena,
                promedioEdades,promedioEdadesCualitativo);  

        return cadena;

    }
}
