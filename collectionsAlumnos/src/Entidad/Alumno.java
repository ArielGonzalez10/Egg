/*

 */
package Entidad;
import java.util.ArrayList;

public class Alumno {
    private String alumno;
    private ArrayList<Integer> notas;
    
    
    public Alumno(){
        
    }

    public Alumno(String alumno, ArrayList<Integer> notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    
    
}
