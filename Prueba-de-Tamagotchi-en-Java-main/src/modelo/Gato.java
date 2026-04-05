package modelo;

public final class Gato extends Mascota{

    public Gato(String nombre) {
        super(nombre);
        
        this.setFelicidad(65);
        this.setEnergia(45);
        
    }
    
    @Override
    public void emitirSonido(){
        System.out.println(this.nombre + " hace: Miaaaaaauuuuu!!!!!");
    }
    
    @Override
    public void alimentar(){
        System.out.println(this.nombre + " come atun con mucha elegancia... Que elegancia la de Francia.");
        this.setHambre(this.hambre - 30);
        this.setFelicidad(this.felicidad + 5);
        System.out.println(this.nombre + " esta muy agradecido por la comida parece...");
    }
    
    @Override
    public void jugar(){
        System.out.println(this.nombre + " se desespera con un puntero laser... Esta corriendo por toda la casa");
        
        this.setFelicidad(this.felicidad + 20);
        this.setEnergia(this.energia - 15);
        this.setHambre(this.hambre + 5);
        
    }
    
    
    @Override
    public void dormir(){
        System.out.println(this.nombre + " esta super cansado. Se acurruca placidamente y duerme con una tranquilidad gigante");
        
        this.setEnergia(InterfaceMascota.MAX_STAT);
        this.setHambre(this.hambre + 10);
        
    }
    
    @Override
    public void envejecer(){
        this.setHambre(this.hambre + 3);
        this.setEnergia(this.energia - 1);
        this.setFelicidad(this.felicidad - 2);
        
    }
    
    @Override
    public void adrenalina(){
        System.out.println(this.nombre + " corre de pared en pared persiguiendo... al parecer esta persiguiendo una pelusa");
        System.out.println("Esta super enfocado en atrapar la pelusa... Va corriendo y saltando... Esta peleando con el aire");
        
        this.setEnergia(this.energia - 20);
        this.setFelicidad(this.felicidad + 10);
        
    }
}
