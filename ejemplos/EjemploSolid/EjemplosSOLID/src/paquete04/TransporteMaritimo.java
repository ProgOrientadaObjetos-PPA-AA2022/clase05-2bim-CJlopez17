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
public class TransporteMaritimo extends Transporte {

    protected String empresamar;
    protected double tarifamar;

    public void establecerEmpresa(String f) {
        empresamar = f;
    }

    @Override
    public void establecerTarifa() {
        tarifamar = 500.20 + 0.12;
    }

    public String obtenerAerolinea() {
        return empresamar;
    }
 
    @Override 
    public String toString(){
        String cadena = String.format("Empresa de barcos\n"
                + "Tarifa de barcos: %.2f\n",obtenerTarifa());
        return cadena; 
    }
}
