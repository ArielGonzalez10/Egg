/*

 */
package collectionsalumnos;

import Servicios.Servicios;
public class CollectionsAlumnos {

 
    public static void main(String[] args) {
        Servicios serv = new Servicios();
        
        serv.agregarAlumno();
        System.out.println("Promedio final: "+serv.calcularNotaFinal());
    }
    
}
