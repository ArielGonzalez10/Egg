/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;
import Entidad.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> compararPorDuracionMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
        
    };
    
    public static Comparator<Pelicula> compararPorDuracionMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
        
    };
    
    public static Comparator<Pelicula> compararPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
        
    };
    
    public static Comparator<Pelicula> compararPorTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
        
    };
}
