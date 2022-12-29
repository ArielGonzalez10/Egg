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
public class Revolver {
    private int posicionTambor;
    private int posicionAgua;

    public Revolver(int posicionTambor, int posicionAgua) {
        this.posicionTambor = posicionTambor;
        this.posicionAgua = posicionAgua;
    }
    
    public Revolver() {
        
    }
    
    public int getPosicionTambor() {
        return posicionTambor;
    }

    public void setPosicionTambor(int posicionTambor) {
        this.posicionTambor = posicionTambor;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver(" + "PosicionTambor: " + posicionTambor + ", PosicionAgua: " + posicionAgua + ')';
    }
    
    //Metodos revolver
    
    public void llenarRevolver(){
        int numRandom1,numRandom2;
        
        numRandom1 = (int) (Math.random()*6);
        numRandom2 = (int) (Math.random()*6);
        
        //Actualiza la posicion del agua y del tambor del revolver
        posicionAgua = numRandom1;
        posicionTambor = numRandom2;
    }
    
    public boolean mojar(){
        return posicionAgua == posicionTambor;
    }
    
    public void siguienteChorro(){
        posicionTambor++;
        if(posicionTambor > 6){
            posicionTambor = 0;
        }
    }
    
    public void infoRevolver(){
        System.out.println(toString());
    }
}
