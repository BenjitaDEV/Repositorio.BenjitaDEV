package modelo;

public final class Pajaro extends Mascota{

    public Pajaro(String nombre) {
        super(nombre);
        
        this.setFelicidad(45);
    }
    
    @Override
    public void emitirSonido(){
        System.out.println(this.nombre + " hace un silbido bastante agradable");
    }
    
    @Override
    public void jugar(){
        System.out.println(this.nombre + " se puso a cantar varias melodias... Parece que es fan de tu musica, porque esta silbando una cancion que se te hace familiar");
        this.setFelicidad(this.felicidad + 15);
        this.setEnergia(this.energia - 3);
        
    }
    
    @Override
    public void alimentar(){
        System.out.println(this.nombre + " come tranquilamente sus semillas y con mucha paciencia... Parece que mucha porque se esta demorando mucho...");
        
        this.setHambre(this.hambre - 20);
        this.setFelicidad(this.felicidad + 8);
        
    }
    
    @Override
    public void dormir(){
        System.out.println(this.nombre + " duerme muy tranquilamente en su jaula");
        
        if (this.energia > 80){
            this.setEnergia(InterfaceMascota.MAX_STAT);
            
        } else {
            this.setEnergia(this.energia + 80);
        }
    }
    
    @Override
    public void envejecer(){
        this.setEnergia(this.energia - 3);
        this.setHambre(this.hambre + 7);
        this.setFelicidad(this.felicidad - 3);
        
    }
    
    @Override
    public void adrenalina(){
        System.out.println(this.nombre + " está como loco y está volando por toda la casa... Y ya se canso");
        this.setEnergia(this.energia - 20);
        this.setHambre(this.hambre + 20);
        this.setFelicidad(this.felicidad + 25);
    }
}
