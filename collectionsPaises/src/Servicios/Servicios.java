
package Servicios;


import java.util.Scanner;
import java.util.TreeSet;
import Entidad.Pais;



public class Servicios {
    
    TreeSet<Pais> listaPaises = new TreeSet();
    Scanner leer = new Scanner(System.in);
    public Pais crearPais(){
        Pais obj = new Pais();
        
        System.out.println("Ingrese el nombre del pais: ");
        obj.setPais(leer.next());
        
        return obj;
    }
    
    
    public void agregarPais(){
        String respuesta;
        do{
            listaPaises.add(crearPais());
            System.out.println("Desea seguir ingresando datos? ");
            respuesta = leer.next();
        }while(respuesta.equals("s"));
        mostrarPaises();
        menu();
        
    }
    
    public void mostrarPaises(){
        for (Pais paises : listaPaises) {
            System.out.println("Pais: "+paises.getPais());
        }
    }
    
 
  
    public void menu(){
        int opcion;
        System.out.println("1-Agregar Pais, 2-Ordenar Alfabeticamente");
        System.out.println("Ingrese lo que desea realizar: ");
        opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                agregarPais();
                break;
            case 2:
                mostrarPaises();
                break;
        }
    }
}
