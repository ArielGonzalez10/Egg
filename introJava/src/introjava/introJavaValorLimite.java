/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package introjava;
import java.util.Scanner;
public class introJavaValorLimite {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un limite: ");
        int limite = leer.nextInt();
        int sumaNum = 0;
        do{
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            sumaNum += num;
            System.out.println("Suma: "+sumaNum);
        }while(sumaNum < limite);
        System.out.println("Suma: "+sumaNum);
        
    }
    
}
