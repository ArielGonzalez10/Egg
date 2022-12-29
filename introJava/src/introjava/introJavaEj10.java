/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class introJavaEj10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        int cantNumeros = 0;
        int num;
        int i,j;
        System.out.println("Ingrese la cantidad de numeros");
        cantNumeros = leer.nextInt();
        for(i = 0; i < cantNumeros;i++){
            System.out.println("Ingrese el numero: ");
            num = leer.nextInt();
            
            for(j = 0; j < num;j++){
                if(j == 0){
                   System.out.println("Num: "+num);
                }
                System.out.println("*");
            }
            
        }
        
    }
    
}
