/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Ariel
 */
public class servicios {
    float resultado;
    
    //Funcion que recibe 2 parametros y devuelve un float
    public float suma(float num1, float num2){
        resultado = num1 + num2;
        return resultado;
    }
    
    //Funcion que recibe 2 parametros y devuelve un float
    public float resta(float num1, float num2){
       resultado = num1 - num2;
        return resultado;
    }
     
    //Funcion que recibe 2 parametros y devuelve un float
    public float multiplicacion(float num1, float num2){
        resultado = num1 * num2;
        return resultado;
    }
    //Funcion que recibe 2 parametros y devuelve un float
    public float division(float num1, float num2){
        resultado = num1 / num2;
        return resultado;
    }
}
