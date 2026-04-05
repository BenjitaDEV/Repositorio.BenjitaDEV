package modelo;

public final class Perro extends Mascota {

    public Perro(String nombre) {
        super(nombre);
        
        this.setFelicidad(60);
        this.setEnergia(65);
        
    }

    @Override
    public void emitirSonido(){
        System.out.println(this.nombre + " dijo: Guau, Guau!!!");
    }
    
    @Override
    public void alimentar(){
        System.out.println(this.nombre + " tiene hambre y come su comida con mucho gusto... Ahora es un perro feliz");
        
        this.setHambre(this.hambre - 40);
        this.setFelicidad(this.felicidad + 10);
        
    }
    
    @Override
    public void jugar(){
        System.out.println(this.nombre + " corre por toda la casa y busca la pelota para jugar");
        this.setFelicidad(this.felicidad + 30);
        this.setEnergia(this.energia - 20);
        this.setHambre(this.hambre + 10);
        
    }
    
    @Override
    public void dormir(){
        System.out.println(this.nombre + " tiene sueño... Va a ir a tomar una siesta a su cama");
        
        this.setEnergia(InterfaceMascota.MAX_STAT);
        this.setHambre(this.hambre + 15);
    }
    
    @Override
    public void envejecer(){
        this.setHambre(this.hambre + 5);
        this.setEnergia(this.energia - 2);
        this.setFelicidad(this.felicidad - 1);
    }
    
    @Override
    public void adrenalina(){
        System.out.println(this.nombre + " le dio un ataque de locura y se puso a correr por la casa... Se canso bastante facil...");
        
        this.setEnergia(this.energia - 25);
        this.setHambre(this.hambre + 10);
    }
    
}
