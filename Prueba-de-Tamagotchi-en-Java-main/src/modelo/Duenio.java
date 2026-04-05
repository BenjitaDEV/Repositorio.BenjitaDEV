package modelo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Duenio {
    
    private String nombre;
    private ArrayList<Mascota> misMascotas;
    private Scanner scanner;
    private Random random;
    
    public Duenio(String nombre) {
        this.nombre = nombre;
        
        this.misMascotas = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        this.random = new Random();
        
    }
    
    public void crearMascota(){
        System.out.println("""
--- CREAR NUEVA MASCOTA ---
¿Que tipo de mascota quieres adoptar?
1.- Perro
2.- Gato
3.- Pajaro
Elige una opcion""");
        
        int op = scanner.nextInt();
        
        scanner.nextLine();
        
        String nombreMascota;
        
        do{
            System.out.println("¿Que nombre le pondras?");
            System.out.print("Ingresa el nombre: ");
            nombreMascota = scanner.nextLine();
            if (nombreMascota.isEmpty() || nombreMascota.isBlank()){
                System.out.println("Como no le vas a nombre... No bromees, ponle un nombre!!");
            }
        
        } while(nombreMascota.isEmpty() || nombreMascota.isBlank());
        
        Mascota nuevaMascota = null;
        
        switch(op){
            case 1:
                nuevaMascota = new Perro(nombreMascota);
                break;
            case 2:
                nuevaMascota = new Gato(nombreMascota);
                break;
            case 3:
                nuevaMascota = new Pajaro(nombreMascota);
                break;
            default:
                System.out.println("Oops... Opcion no valida");
                return;
        }
        
        this.misMascotas.add(nuevaMascota);
        System.out.println("Felicidades!!! Has a adoptado a " + nombreMascota);
        nuevaMascota.emitirSonido();
        
    }
    
    public Mascota seleccionarMascota(){
        System.out.println("\n --- SELECCIONAR MASCOTA ---");
        if (this.misMascotas.isEmpty()){
            System.out.println("Aun no tienes mascotas. Adopta una primero!!!");
            return null;
        }
        
        System.out.println("¿Con que mascota quieres interactuar?");
        for(int i = 0; i < this.misMascotas.size(); i++){
            System.out.println((i + 1) + "." + this.misMascotas.get(i).getNombre());
        }
        System.out.println("Elige un numero: ");
        
        int eleccion = scanner.nextInt();
        scanner.nextLine();
        
        if (eleccion < 1 || eleccion > this.misMascotas.size()){
            System.out.println("Seleccion no valida");
            return null;
        }
        
        return this.misMascotas.get(eleccion - 1);
    }

   
    
    public void interactuar(Mascota mascota){
        System.out.println("\n--- INTERACTUANDO CON " + mascota.getNombre().toUpperCase() + " ---");
        System.out.println(mascota.toString());
        mascota.emitirSonido();
        
        System.out.println("""
\n¿Que quieres hacer?
1.- Alimentar
2.- Jugar
3.- Dormir
4.- No hacer nada (volver)
Elige una opcion: """);
        
        int op = scanner.nextInt();
        switch (op){
            case 1:
                mascota.alimentar();
                break;
            case 2:
                mascota.jugar();
                break;
            case 3:
                mascota.dormir();
                break;
            case 4:
                System.out.println(mascota.getNombre() + " te mira con atencion");
                break;
            default:
                System.out.println("Oops... Elige una opcion valida");
        }
        
        System.out.println("\n--- Estado despues de la accion ---");
        System.out.println(mascota.toString());
        
        if (random.nextInt(5) == 0){
            System.out.println("\n--- Oh, a tu mascota le dio... un ataque de adrenalina... Se volvio loco...");
            
            mascota.adrenalina();
            
            System.out.println("\n--- Estado despues de su adrenalina ---");
            System.out.println(mascota.toString());
        }
        
        
    }
    
    public void simularPasoTiempo() {
            if (this.misMascotas.isEmpty()){
                return;
            }
            System.out.println("\n--- El tiempo pasa... ---");
            for (Mascota mascota : this.misMascotas){
                mascota.envejecer();
            }
        }
}
