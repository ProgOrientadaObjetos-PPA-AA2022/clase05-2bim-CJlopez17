/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete10;

import javax.swing.plaf.synth.SynthToggleButtonUI;

public class GeneradorPeliculas {
    
    private APIMovie llave;
    private String url;
    
    public void establecerLlave(APIMovie l){ // APINetflix, APIAmazon
        llave = l;
    }
    
    public void establecerUrl(String l){
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }
    
    public APIMovie obtenerLlave(){
        return llave;
    }
    
    public String obtenerUrl(){
        return url;
    }

    @Override
    public String toString(){
        String cadena = String.format("%s %s", obtenerLlave(),obtenerUrl());
        return cadena;
    }
}
