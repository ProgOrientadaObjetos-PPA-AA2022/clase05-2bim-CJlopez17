/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author camil
 */
public class TransporteAereo {
    private String aerolinea; 
    private double tarifa;
    
    public void establecerArolinea(String f){
        aerolinea = f;
    }
    public void establecerTarifa(){
        tarifa = 500.20 + 0.12;
    }
    public String obtenerAerolinea(){
        return aerolinea;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
    
}   
