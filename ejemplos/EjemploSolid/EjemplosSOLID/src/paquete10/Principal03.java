package paquete10;

public class Principal03 {
    public static void main(String[] args) {
        String nombreArchivo = "Pelis.txt";

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.obtenerListaPeliculas();
        System.out.println(lectura);
    }
}
