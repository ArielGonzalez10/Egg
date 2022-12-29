/*
3. Realizar una baraja de cartas españolas orientada a objetos. 
Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). 
Esta clase debe contener un método toString() que retorne el número de carta y el palo.
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

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
package relacionesej3;
import Entidad.Baraja;
import Entidad.Carta;

import java.util.ArrayList;
import java.util.Scanner;
public class RelacionesEj3 {

    public static void main(String[] args) {
        ArrayList<Carta> barajaCartas = new ArrayList();
        Baraja mazoCartas = new Baraja(barajaCartas);
        String decision;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("---Se agregan cartas a la Baraja---");
        
        for(int i = 1; i <= 12;i++){
            if((i == 8)  || (i == 9)){
                
                continue;
            }
            Carta cartaEspada = new Carta("Espada",i);
            barajaCartas.add(cartaEspada);
            Carta cartaBasto = new Carta("Basto",i);
            barajaCartas.add(cartaBasto);
            Carta cartaOro = new Carta("Oro",i);
            barajaCartas.add(cartaOro);
            Carta cartaCopas = new Carta("Copas",i);
            barajaCartas.add(cartaCopas);
        }
        
        mazoCartas.setBaraja(barajaCartas);
        
        
        do{
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("1-Barajar mazo, 2-Mostrar siguiente carta, 3-Mostrar cantidad de cartas disponibles, 4-Dar cartas, 5- Mostrar las cartas que salieron, 6-Mostrar mazo ");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    mazoCartas.barajar(barajaCartas);
                    break;
                case 2:
                    mazoCartas.siguienteCarta();
                    break;
                case 3:
                    System.out.println("Cartas disponibles: "+mazoCartas.cartasDisponibles());
                    break;
                case 4:
                    mazoCartas.darCartas();
                    break;
                case 5:
                    System.out.println("Cartas que salieron: "+mazoCartas.cartasMonton());
                    break;
                case 6:
                    mazoCartas.mostrarBaraja();
                    break;
            }
            
            System.out.println("Desea realizar alguna accion?: ");
            decision = leer.next();
        }while(decision.equals("s"));
    }
    
}
