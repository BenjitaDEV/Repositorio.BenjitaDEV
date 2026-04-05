package main;

import modelo.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("Holaaaaa\n\nPresiona ENTER");
        input.nextLine();
        System.out.print("Se bienvenido a... Kamaboko Adoptame\n\nPresiona ENTER");
        input.nextLine();
        System.out.println("¿Podrias decirme como te llamas?");
        
        
        String nombreDuenio;
        Duenio duenio;
        
        do {
            System.out.print("Ingresa tu nombre: ");
            nombreDuenio = input.nextLine();
            
            if (nombreDuenio.isEmpty() || nombreDuenio.isBlank()){
                System.out.println("Como que no tienes nombre... No bromees, Dime tu nombre!!");
            }
        }while(nombreDuenio.isEmpty() || nombreDuenio.isBlank());
        
        duenio = new Duenio(nombreDuenio);
        
        System.out.println("Holaa " + nombreDuenio + " Mucho gusto!!!");
        input.nextLine();
        System.out.println("Tu aventura comienza ahora!!");
        
        boolean seguirJugando = true;
        
        while(seguirJugando){
            System.out.println("""
\n=================================
--- MENU PRINCIPAL ---
1.- Adoptar una nueva mascota
2.- Interactuar con una mascota
3.- Salir del juego
Elige una opcion:  """);
            
            int opcionMenu = input.nextInt();
            input.nextLine();
            
            switch (opcionMenu){
                case 1:
                    duenio.crearMascota();
                    break;
                case 2:
                    Mascota mascotaSeleccionada = duenio.seleccionarMascota();
                    
                    if (mascotaSeleccionada != null){
                        duenio.interactuar(mascotaSeleccionada);
                    }
                    break;
                case 3:
                    System.out.println("Gracias por jugar!!! Tus mascotas te extañaran... Adios!!!!!!");
                    seguirJugando = false;
                    break;
                default:
                    System.out.println("Oops... Opcion no valida");
            }
            
            if (seguirJugando){
                duenio.simularPasoTiempo();
            }
        }
        
        input.close();
    }
}