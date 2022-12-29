/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.util.Scanner;
import Entidad.Alumno;
import java.util.ArrayList;

import java.util.LinkedList;

public class Servicios {
    Scanner leer = new Scanner(System.in);
    LinkedList<Alumno> listaAlumnos = new LinkedList();
    
    
    int nota;
    public Alumno crearAlumno(){
        String nombre;
        ArrayList<Integer> listaNotas = new ArrayList();
        Alumno alum = new Alumno();
        
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = leer.next();
        for(int i = 0;i < 3 ;i++){
            System.out.println("Ingrese una nota: ");
            nota = leer.nextInt();
            listaNotas.add(nota);
        }
        alum.setAlumno(nombre);
        alum.setNotas(listaNotas);
        return alum;
    }
    
    public void agregarAlumno(){
        String respuesta = "s";
        while(respuesta.equals("s")){
            Alumno alum = crearAlumno();
            listaAlumnos.add(alum);
            System.out.println("Desea seguir ingresando datos?: ");
            respuesta = leer.next();
        }
        
    }
    
    
    public int calcularNotaFinal(){
        int promedioFinal;
        int sumaNotas = 0;
        
        System.out.println("Ingrese el nombre del alumno que quiere calcular la nota: ");
        String nombre1 = leer.next();
       
        
        for(Alumno alumno: listaAlumnos){
            System.out.println("nombre "+alumno.getAlumno());
            System.out.println("Notas: "+alumno.getNotas());
            if(alumno.getAlumno().equals(nombre1)){
                System.out.println("Alumno encontrado");
                for(int i = 0; i < 3; i++){
                    sumaNotas = sumaNotas + alumno.getNotas().get(i);
                }
                
            }else{
                System.out.println("Alumno no encontrado");
            }
        }
        System.out.println("SumaNotas: "+sumaNotas);
        
           
        
        promedioFinal = sumaNotas / 3;
        
        return promedioFinal;
    }

}
