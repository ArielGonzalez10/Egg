/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class introJavaMatrizTraspuesta {

   
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        int i,j;
        
        System.out.println("MATRIZ A");
        for(i = 0;i < 3;i++){
            for(j = 0;j < 3;j++){
                System.out.println("Ingrese un numero: ");
                matrizA[i][j] = leer.nextInt();
            }
        }
         for(i = 0;i < 3;i++){
            for(j = 0;j < 3;j++){
                System.out.print(" "+matrizA[i][j]);
                System.out.print(" ");
             
            }
             System.out.println(" ");
        }
        
         System.out.println("MATRIZ TRASPUESTA");      
        for(j = 0;j < 3;j++){
            for(i = 0;i < 3;i++){
                matrizB[i][j] = matrizA[i][j];
            }
        }
          
        for(j = 0;j < 3;j++){
            for(i = 0;i < 3;i++){
                 System.out.print(" "+matrizB[i][j]);
                System.out.print(" ");
             
            }
             System.out.println(" ");
        }
         
    }
    
}
