/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;
import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        
        Persona e1 = new Persona("Camilo",19);
        Persona e2 = new Persona("Samuel",20);
        Persona e3 = new Persona("Manuel",21);
                
        ArrayList<Persona> listado = new ArrayList<>();
        
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        
        OperacionesEstudiantes k1 = new OperacionesEstudiantes();
        k1.establecerEstudiante(listado);
        k1.establecerPromedioEdades();
        
        System.out.println(k1);
                
    }
}
