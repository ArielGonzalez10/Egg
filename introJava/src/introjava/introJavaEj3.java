/*
2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package introjava;
import java.util.Scanner;

public class introJavaEj3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println("Ingrese la frase para pasar a mayusculas: ");
        frase = leer.next();
        String fraseMayuscula = frase.toUpperCase();
        String fraseMinuscula = frase.toLowerCase();
        System.out.println("Frase en mayuscula: "+fraseMayuscula);
        
        System.out.println("Frase en minuscula: "+fraseMinuscula);
    }
    
}
