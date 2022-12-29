/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Libro;
import Entidad.Libro;
import java.util.Scanner;
public class servicios {
    Libro libro = new Libro();
    Scanner leer = new Scanner(System.in);
    
      public void cargarDatosLibro(){
       
        System.out.println("Ingrese el titulo del libro: ");
        libro.setTitulo(leer.nextLine());
    
        System.out.println("Ingrese el nombre del autor del libro: ");
        libro.setNombreAutor(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        libro.setCantPag(leer.nextInt());
        
        System.out.println("Ingrese el isbn del libro: ");
        libro.setIsbn(leer.nextInt());
        
    }
    
    public void mostrarDatosLibro(){
        
        System.out.println("Titulo del libro: "+libro.getTitulo());
        
    
        System.out.println("Nombre del autor: "+libro.getNombreAutor());
        
        
        System.out.println("Paginas del libro: "+libro.getCantPag());
        
        
        System.out.println("Isbn del libro: "+libro.getIsbn());
        
        
    }
}
