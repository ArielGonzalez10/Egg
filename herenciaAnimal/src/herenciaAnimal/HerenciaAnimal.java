/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package herenciaAnimal;
import Entidad.Animal;
import Entidad.Perro;
import Entidad.Caballo;
import Entidad.Gato;
import java.util.ArrayList;


public class HerenciaAnimal {

  
    public static void main(String[] args) {
        Perro perrito = new Perro();
        Gato gatito  = new Gato();
        Caballo caballito = new Caballo();
        
        perrito.setAlimento("Pedigree");
        perrito.setNombre("Krypto");
        perrito.setRaza("Dogo");
        
        gatito.setAlimento("Whiskas");
        gatito.setNombre("Anubis");
        gatito.setRaza("Esfinge");
        
        
        caballito.setAlimento("Alfalfa");
        caballito.setNombre("Sparky");
        caballito.setRaza("Corredor");
        
        ArrayList<Animal> listaAnimales = new ArrayList();
        listaAnimales.add(gatito);
        listaAnimales.add(perrito);
        listaAnimales.add(caballito);

        for (Animal animales : listaAnimales) {
              animales.alimentarse();
        }
    }
    
}
