package logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        EmpresaCruceros empresa1 = new EmpresaCruceros("balearia");

        int opcionMenu = 0;
//        while (programaOn==0) {
        do{
            System.out.println("""
                               Elige la opcion deseada
                               Opcion 1: Lista de viajes y su informacion. 
                               Opcion 2: Vender un crucero.
                               Opcion 3: Informacion de cada viaje y sus pasajeros
                               Opcion 4: Consultar estadisticas historicas.
                               Opcion 5: Estado de los cruceros (Disponibles o llenos). 
                               Opcion 8: Gracias por su visita""");
            try{
            opcionMenu = input.nextInt();
            }catch (Exception e){
                System.out.println("Opcion seleccionada no valida.");
            opcionMenu = 0; 
            }switch (opcionMenu) {

                case 1 -> //PUNTO 1: lista de viajes disponibles 
                    empresa1.verListaViajes();

                case 2 -> // Vender crucero a pasajero o grupo familiar. 
                    empresa1.venderBillete();

                case 3 -> {// ver lista de pasajeros de una embarcacion. 
                    empresa1.verListaPasajeros();
                }
                
                case 4 -> // ver datos estadisticos
                    empresa1.verDatosEstadisticos();
                    
                case 5 -> empresa1.disponibilidadCruceros(); 

                case 8 -> {
                    System.out.println("Saliendo del programa");
                }   
            }
        }while(opcionMenu !=8);
    }
}
