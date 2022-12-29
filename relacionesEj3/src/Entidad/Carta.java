
package Entidad;

/**
Realizar una baraja de cartas españolas orientada a objetos. 
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
Esta clase debe contener un método toString() que retorne el número de carta y el palo.
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.
 */
public class Carta {
    
    private String palo;
    private int numero;
    
    
    public Carta(String palo, int numero){
        this.numero = numero;
        this.palo = palo;
    }
    
    
    public void setPalo(String palo){
        this.palo = palo;
    }
    
    public String getPalo(){
        return palo;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
                
    }
    
    public int getNumero(){
        return numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "palo=" + palo + ", numero=" + numero + '}';
    }
    
    
    
}
