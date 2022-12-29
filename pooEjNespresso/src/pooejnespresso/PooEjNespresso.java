/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooejnespresso;
import java.util.Scanner;
import Servicios.Servicios;
import Entidad.Cafetera;

public class PooEjNespresso {

  
    public static void main(String[] args) {
        //Objetos
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera1 = new Cafetera();
        Servicios serv = new Servicios();
        
        //Crea la cafetera y la llena
        cafetera1 = serv.llenarCafetera();
        System.out.println("Capacidad Maxima: "+cafetera1.getCapacidadMaxima());
        System.out.println("Capacidad Actual: "+cafetera1.getCapacidadActual());
        
        //Sirve una taza de cafe
        System.out.println("Ingrese el tamaño de la taza: ");
        serv.servirTaza(leer.nextInt());
        System.out.println("Capacidad actual del cafe: "+cafetera1.getCapacidadActual());
        
        //Carga cafe
        System.out.println("Ingrese la cantidad de cafe que desea cargar");
        serv.cargarCafe(leer.nextInt());
        
        System.out.println("Capacidad Maxima: "+cafetera1.getCapacidadMaxima());
        System.out.println("Capacidad Actual: "+cafetera1.getCapacidadActual());
        
        
        //Vacia la taza de cafe
        serv.vaciarCafetera();
        System.out.println("Capacidad Actual: "+cafetera1.getCapacidadActual());
        
        //LLena la cafetera
        cafetera1 = serv.llenarCafetera();
        System.out.println("Capacidad Maxima: "+cafetera1.getCapacidadMaxima());
        System.out.println("Capacidad Actual: "+cafetera1.getCapacidadActual());
        
        
        
        
      
        
    }
    
}
