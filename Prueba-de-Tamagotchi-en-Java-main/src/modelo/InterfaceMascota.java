package modelo;

public interface InterfaceMascota {
    int MAX_STAT = 100;
    int MIN_STAT = 0;
    
    void alimentar();
    void jugar();
    void dormir();
    void adrenalina();
    void envejecer();
}
