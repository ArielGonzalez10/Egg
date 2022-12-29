
package Servicios;
import java.util.Scanner;
import java.util.ArrayList;
import Entidad.Pelicula;
import java.util.Collections;
import Comparadores.Comparadores;

public class Servicios {
    Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public Pelicula crearPelicula(){
        Pelicula peli = new Pelicula();
        
        System.out.println("Ingrese la duracion de la pelicula: ");
        peli.setDuracion(leer.nextDouble());
        
        System.out.println("Ingrese el titulo de la pelicula: ");
        peli.setTitulo(leer.next());
        
        System.out.println("Ingrese el nombre del director: ");
        peli.setDirector(leer.next());

        return peli;
    }
    
    
    public void agregarPelicula(){
        String respuesta;
        do{
            Pelicula pelicula = crearPelicula();
            listaPeliculas.add(pelicula);
            System.out.println("Desea seguir creando peliculas?: ");
            respuesta = leer.next();
        }while(respuesta.equals("s"));
        menu();
    }
    
    public void mostrarCartelera(){
        System.out.println("---Peliculas---");
        for (Pelicula cartelera : listaPeliculas) {
            System.out.println("Titulo: "+cartelera.getTitulo());
            System.out.println("Director: "+cartelera.getDirector());
            System.out.println("Duracion: "+cartelera.getDuracion());
        }
    }
    
    public void mostrarPeliculas1Hora(){
        System.out.println("---Peliculas duracion 1 hora---");
        for (Pelicula cartelera : listaPeliculas) {
            if(cartelera.getDuracion() > 1){
               System.out.println("Titulo: "+cartelera.getTitulo());
               System.out.println("Duracion: "+cartelera.getDuracion());
            }
        }
    }
    
    public void ordenarMayorDuracion(){
        Collections.sort(listaPeliculas, Comparadores.compararPorDuracionMayor);
        for (Pelicula cartelera : listaPeliculas) {
            System.out.println("Titulo: "+cartelera.getTitulo());
            System.out.println("Duracion: "+cartelera.getDuracion());
        }
    }
       
    public void ordenarMenorDuracion(){
        Collections.sort(listaPeliculas, Comparadores.compararPorDuracionMenor);
        for (Pelicula cartelera : listaPeliculas) {
            System.out.println("Titulo: "+cartelera.getTitulo());
            System.out.println("Duracion: "+cartelera.getDuracion());
        }
    }
    
    public void ordenarPeliculaTitulo(){
        Collections.sort(listaPeliculas, Comparadores.compararPorTitulo);
        for (Pelicula cartelera : listaPeliculas) {
            System.out.println("Titulo: "+cartelera.getTitulo());
            System.out.println("Duracion: "+cartelera.getDuracion());
        }
    }
    
    public void ordenarPeliculaDirector(){
        Collections.sort(listaPeliculas, Comparadores.compararPorDirector);
        for (Pelicula cartelera : listaPeliculas) {
            System.out.println("Titulo: "+cartelera.getTitulo());
            System.out.println("Duracion: "+cartelera.getDirector());
        }
    }
    
    public void menu(){
        /*• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
          • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
          • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
          • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
          • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
        System.out.println("1-Peliculas mayor a 1 hora, 2-Peliculas Mayor duracion, 3-Peliculas menor duracion, 4-Peliculas por titulo, 5-Peliculas por director, 6-Mostrar todas las peliculas");
        System.out.println("Ingrese la opcion que desea realizar: ");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                mostrarPeliculas1Hora();
                menu();
                break;
            case 2:
                ordenarMayorDuracion();
                menu();
                break;
            case 3:
                ordenarMenorDuracion();
                menu();
                break;    
            case 4:
                ordenarPeliculaTitulo();
                menu();
                break;
            case 5:
                ordenarPeliculaDirector();
                menu();
                break;
            case 6:
                mostrarCartelera();
                menu();
                break;
        }
    }
    
}
