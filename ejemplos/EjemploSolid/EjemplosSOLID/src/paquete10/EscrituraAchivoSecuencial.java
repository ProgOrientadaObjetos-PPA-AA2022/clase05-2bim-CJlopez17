package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraAchivoSecuencial {

    private String nombreArchivo;
    private ObjectOutputStream salida;
    private GeneradorPeliculas registro;
    private ArrayList<GeneradorPeliculas> lista;

    public EscrituraAchivoSecuencial(String nombre){
        nombreArchivo = nombre;
        establecerLista();
        try{
            salida = new ObjectOutputStream(new FileOutputStream(nombreArchivo));
            if (obtenerLista().size() > 0){
                for(int i = 0; i < obtenerLista().size(); i++){
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        }catch (IOException e){
            System.err.println("Error al abrir el archivo.");
        }
    }
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }

    public void establecerRegistro(GeneradorPeliculas f){
        registro = f;
    }

    public void establecerSalida(){
        try{
            salida.writeObject(registro);
        }catch (IOException e){
            System.err.println("Error al escribir el archivo");
        }
    }

    public void establecerLista(){
        LecturaArchivoSecuencial f = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        f.obtenerListaPeliculas();
        lista = f.obtenerListaPeliculas();
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerLista(){
        return lista;
    }

    public ObjectOutputStream obtenerSalida(){
        return salida;
    }

    public void cerrarArchivo(){
        try{
            if(salida != null){
                salida.close();
            }
        }catch (IOException ex){
            System.err.println("Error al cerrar el archivo.");
        }
    }
}
