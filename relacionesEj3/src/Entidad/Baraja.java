/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.

• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.

• cartasDisponibles(): indica el número de cartas que aún se puede repartir.

• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.

• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario

• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Entidad;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
public class Baraja {
    
    Scanner leer = new Scanner(System.in);
    private ArrayList<Carta> cartasDadas = new ArrayList();
    private ArrayList<Carta> barajaCarta;
    int  contador = 0;
    int i = 1;
    Carta obj1;
    
    public Baraja(){
        
    }
    
    public Baraja(ArrayList<Carta> barajaCarta){
        this.barajaCarta = barajaCarta;
    }
    
    public void setBaraja(ArrayList<Carta> barajaCarta){
        this.barajaCarta = barajaCarta;
    }
    
    public ArrayList<Carta> getBaraja(){
        return barajaCarta;
    }
    
    public void barajar(ArrayList<Carta> barajaCarta){
        Collections.shuffle(barajaCarta);
    }
    
    public void siguienteCarta(){
        
        for(i = 0; i < barajaCarta.size();i++ ){
            System.out.println("La siguiente carta es: "+barajaCarta.get(i));
            break;
        }
        
    }
    
    public int cartasDisponibles(){
        return barajaCarta.size();
    }
    
    public void darCartas(){

        System.out.println("Ingrese la cantidad de cartas a recibir: ");
        int cantCartas = leer.nextInt();
        
        if(barajaCarta.isEmpty()){
           System.out.println("---No hay mas cartas para dar---"); 
        }else if(barajaCarta.size() < cantCartas){
            System.out.println("No alcanza la cantidad de cartas...");
        }else{
            for(i = 0; i < cantCartas;i++){
                obj1 = barajaCarta.get(i);
                cartasDadas.add(obj1);
                barajaCarta.remove(obj1);
            }
        }
        
    }
    
    public ArrayList<Carta> cartasMonton(){
        
        return cartasDadas;
    }
    
    public void mostrarBaraja(){
        System.out.println("---CARTAS RESTANTES---");
        for(i = 0; i < barajaCarta.size(); i++){
            System.out.println(""+barajaCarta.get(i));
        }
    }
    
}
