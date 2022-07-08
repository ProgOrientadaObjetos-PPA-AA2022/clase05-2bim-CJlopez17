/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tipos;
        ArrayList<Transporte> lista = new ArrayList<>();

        
        TransporteBus bus = new TransporteBus();
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerTarifa();

        TransporteAereo avion = new TransporteAereo();
        avion.establecerTarifa();

        TransporteMaritimo barco = new TransporteMaritimo();
        barco.establecerTarifa();
        do {
            System.out.println("Ingrese el tipo de tranpote que desee\n"
                + "Bus    [1]\n"
                + "Taxi   [2]\n"
                + "Avion  [3]\n"
                + "Barco  [4]\n"
                + "Terminar el programa [5]");
            tipos = sc.nextInt();
            sc.nextLine();

            switch (tipos) {
                case 1:

                    lista.add(bus);
                    break;

                case 2:

                    lista.add(taxi);
                    break;
                    
                case 3:

                    lista.add(avion);
                    break;
                    
                case 4:
                    lista.add(barco);
                    break;
                case 5:
                    tipos = 0;
                    break;
                default:
                    break;
            }
        } while (tipos != 0);
        TiposTransporte XD = new TiposTransporte();
        XD.establecerTransportes(lista);
        XD.establecerPromedioTarifas();
        
        System.out.println(XD);
                
                
    }
}
