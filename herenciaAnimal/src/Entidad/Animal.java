/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Ariel
 */
public abstract class Animal {
    protected String nombre;
    protected String raza;
    protected String alimento;
    protected int edad;

    public Animal() {
        
    }
    
    public Animal(String nombre, String raza, String alimento, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.alimento = alimento;
        this.edad = edad;
    }
    
    public abstract void alimentarse();
    
}
