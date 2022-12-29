/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package relacionesmascota;

import Entidad.Persona;
import Entidad.Perro;

public class MascotaRelaciones {

    
    public static void main(String[] args) {
      
        Persona per1 = new Persona();
        Persona per2 = new Persona();
        
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        
        //Primera persona
        per1.setNombre("Ariel");
        per1.setApellido("Gonzalez");
        per1.setEdad(25);
        per1.setDni(42735725L);
        
        //Primer perro
        perro1.setNombre("Ulises");
        perro1.setRaza("Dogo");
        perro1.setTamaño("Grande");
        perro1.setEdad(4);
        
        
        per1.setPerro(perro1);
        
        //Segunda persona
        per2.setNombre("Maxi");
        per2.setApellido("Gonzalez");
        per2.setEdad(22);
        per2.setDni(43789643L);
        
        //Segundo perro
        perro2.setNombre("Atenea");
        perro2.setRaza("poodle");
        perro2.setTamaño("chico");
        perro2.setEdad(2);
        
        
        per2.setPerro(perro2);
        
        System.out.println("---Primer dueño---");
        System.out.println("Persona: "+per1.getNombre());
        System.out.println("Edad: "+per1.getEdad());
        System.out.println("Perro: "+per1.getPerro().getNombre());
        System.out.println("Perro: "+per1.getPerro().getRaza());
        
         
        System.out.println("---Segundo dueño---");
        System.out.println("Persona: "+per2.getNombre());
        System.out.println("Edad: "+per2.getEdad());
        System.out.println("Perro: "+per2.getPerro().getNombre());
        System.out.println("Perro: "+per2.getPerro().getRaza());
    }
    
}
