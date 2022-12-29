/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class Juego {
    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    public Juego() {
        
    }

    public Juego(Revolver revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
    
    public void llenarJuego(ArrayList<Jugador> listaJugadores, Revolver r){
        revolver = r;
        jugadores = listaJugadores;
    }
    
    
    public void ronda(){
        revolver.llenarRevolver();
        for (Jugador jugador : jugadores) {
            revolver.infoRevolver();
            jugador.setMojado(jugador.disparo(revolver));
            
            if(jugador.isMojado()){
                break;
            }
        }
        
        for (Jugador jugador : jugadores) {
            
            if(jugador.isMojado()){
                System.out.println("El jugador mojado es: "+jugador.getNombre());
            }else{
                System.out.println("NO se mojo el jugador");
            }
        }
    }
}
