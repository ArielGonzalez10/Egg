
package Entidad;


public class Cafetera {
    //Atributos
    private int capacidadActual;
    private int capacidadMaxima;
    
    //Constructores
    public Cafetera(){
        
    }
    
    public Cafetera(int capacidadMaxima, int capacidadActual){
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    
    //Getters y setters
    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
    
    
}
