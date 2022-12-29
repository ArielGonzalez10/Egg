/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package introjava;

public class javaIntroNumeros {

   
    public static void main(String[] args) {
        int[] arreglo = new int[100];
        int i;
        
        for(i = 0; i< 100;i++){
            arreglo[i] = i+1;
              System.out.println(" "+arreglo[i]);
        }
        
        System.out.println("Decreciente");
        for(i = 99; i >= 0;i--){
            System.out.println(" "+arreglo[i]);
        }
    }
    
}
