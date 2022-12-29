/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package introjava;
import java.util.Scanner;
public class javaIntrogradosFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float grados;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese unos grados farenheit: ");
        grados = leer.nextFloat();
        
        float farenheit = 32 + (9 * grados / 5);
        
        System.out.println("Grados farenheit: "+farenheit);
    }
    
}
