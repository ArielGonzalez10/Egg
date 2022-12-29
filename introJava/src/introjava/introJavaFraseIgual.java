/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package introjava;
import java.util.Scanner;
public class introJavaFraseIgual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese la frase: ");
        frase = leer.next();
        if(frase.equals("eureka")){
            System.out.println("Son palabras iguales");
        }else{
            System.out.println("Es una palabra distinta");
        }
    }
    
}
