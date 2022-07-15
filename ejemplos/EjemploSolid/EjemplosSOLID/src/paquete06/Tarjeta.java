package paquete06;

public class Tarjeta {
    protected String nombreBanco;
    protected double cupoMaximo;

    public Tarjeta (String f, double s){
        nombreBanco = f;
        cupoMaximo = s;
    }

    public void establecerNombreBanco(String nom ){
        nombreBanco = nom;
    }
    public void establecerCupoMaximo(double nom ){
        cupoMaximo = nom;
    }

    public String obtenerNombreBanco(){
        return nombreBanco;
    }

    public double obtenerCupoMaximo(){
        return cupoMaximo;
    }
}
