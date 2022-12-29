/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package collectionsrazas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CollectionsRazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> razaPerros = new ArrayList();
        String decision;
        Scanner leer = new Scanner(System.in);
        String raza;
        do{
            System.out.println("Ingrese una raza: ");
            raza = leer.next();
            razaPerros.add(raza);
            System.out.println("Desea seguir ingresando razas? ");
            decision = leer.next();
        }while(decision.equals("s"));
         
        Iterator<String> it = razaPerros.iterator();
        
        System.out.println("Ingrese una raza a buscar: ");
        raza = leer.next();
        while(it.hasNext()){
        
            if(it.next().equals(raza)){
                System.out.println("El perro se encuentra en la lista");
            }else{
                System.out.println("El perro no esta en la lista");
            }
        }
    }
    
}
