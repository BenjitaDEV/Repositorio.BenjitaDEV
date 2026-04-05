package modelo;

public abstract class Mascota implements InterfaceMascota{
    
    protected String nombre;
    protected int hambre, energia, felicidad;

    public Mascota(String nombre) {
        this.nombre = nombre;
        
        this.hambre = 50;
        this.energia = 50;
        this.felicidad = 50;
        
    }
    
    public Mascota() {
    }
    
    public abstract void emitirSonido();
    
    @Override
    public final String toString(){
        
        String barraHambre = "Hambre:    [" + "█".repeat(hambre / 10) + " ".repeat(10 - hambre / 10) + "] " + hambre + "%";
        String barraEnergia = "Energía:   [" + "█".repeat(energia / 10) + " ".repeat(10 - energia / 10) + "] " + energia + "%";
        String barraFelicidad = "Felicidad: [" + "█".repeat(felicidad / 10) + " ".repeat(10 - felicidad / 10) + "] " + felicidad + "%";
        
        return "--- " + this.nombre.toUpperCase() + " ---" +
               "\n" + barraHambre +
               "\n" + barraEnergia +
               "\n" + barraFelicidad;
    }
    
    protected int normalizarStat(int valor){
        if (valor > InterfaceMascota.MAX_STAT){
            return InterfaceMascota.MAX_STAT;
        }
        if (valor < InterfaceMascota.MIN_STAT){
            return InterfaceMascota.MIN_STAT;
        }
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getFelicidad() {
        return felicidad;
    }

    public void setFelicidad(int felicidad) {
        this.felicidad = felicidad;
    }
    
}
