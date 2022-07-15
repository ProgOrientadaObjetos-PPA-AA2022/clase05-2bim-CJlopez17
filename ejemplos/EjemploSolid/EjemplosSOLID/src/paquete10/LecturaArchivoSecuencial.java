package paquete10;

import com.sun.tools.attach.AgentInitializationException;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

public class LecturaArchivoSecuencial {

    private ObjectInputStream entrada;
    private ArrayList<GeneradorPeliculas> peliculas;
    private String nombreArchivo;

    public LecturaArchivoSecuencial (String n){
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            try{
                entrada = new ObjectInputStream(new FileInputStream(n));
            }catch (IOException e){
                System.err.println("Error al abrir el archivo.");
            }
        }
    }

    public void establecerNombreArchivo(){
        peliculas = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());
        if(f.exists()){
            while (true){
                try{
                    GeneradorPeliculas registro = (GeneradorPeliculas) entrada.readObject();
                }catch (EOFException e){
                    return;
                }catch (IOException ex){
                    System.err.println("Error al leer el archivo." + ex);
                }catch (ClassNotFoundException ex){
                    System.err.println("No se pudo crear el objeto: " + ex);
                }catch (Exception ed){
                    break;
                }
            }
        }
    }

    public ArrayList<GeneradorPeliculas> obtenerListaPeliculas(){
        return peliculas;
    }

    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> getPeliculas() {
        return peliculas;
    }
    @Override
    public String toString(){
        String cadena = "Lista de Peliculas\n";
        for (int i = 0; i < obtenerListaPeliculas().size(); i++){
            GeneradorPeliculas p = obtenerListaPeliculas().get(i);
            cadena = String.format("%s%s\n", cadena,p.toString());
        }
        return cadena;
    }
    public void cerrarArchivo(){
        try{
            if(entrada != null){
                entrada.close();
            }
            System.exit(0);
        }catch (IOException ex){
            System.err.println("Erro al cerro el archivo");
            System.exit(1);
        }
    }
}
