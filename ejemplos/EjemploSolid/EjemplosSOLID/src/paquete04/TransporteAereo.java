/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author camil
 */
public class TransporteAereo extends Transporte {
    private String aerolinea; 
    private double tarifa;
    
    public void establecerArolinea(String f){
        aerolinea = f;
    }
    @Override
    public void establecerTarifa(){
        tarifa = 500.20 + 0.12;
    }
    public String obtenerAerolinea(){
        return aerolinea;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Aerolinea\n"
                + "Tarifa de aerolinea: %.2f\n",tarifa);
        return cadena; 
    }
}
