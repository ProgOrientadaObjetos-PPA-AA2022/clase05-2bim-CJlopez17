package paquete10;

public class Principal02 {
    public static void main(String[] args) {

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp);

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2);

        System.out.println("---------------------------");

        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("5014785");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3);

        System.out.println("---------------------------");

        APIDirectvGO api4 = new APIDirectvGO();
        api4.establecerApiKey("514189");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4);
        String nombreArchivo = "Pelis.txt";

        GeneradorPeliculas[] lista = {gp,gp2,gp3,gp4};

        EscrituraAchivoSecuencial archivo = new EscrituraAchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++){
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();
    }
}

