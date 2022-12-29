/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package introjava;
import java.util.Scanner;
public class introJavaEj9 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantNumero = 0;
        int numero;
        int sumaNumero = 0;
        do{
            System.out.println("Ingrese un numero: ");
            numero = leer.nextInt();
            if(numero > 0){
                sumaNumero += numero;
            }else if(numero == 0){
                break;
            }
            cantNumero++;
        }while(cantNumero < 20);
        System.out.println("La suma de numeros es: "+sumaNumero);
    }
    
}
