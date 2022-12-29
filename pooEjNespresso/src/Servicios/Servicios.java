
 
package Servicios;
import Entidad.Cafetera;

public class Servicios {
    Cafetera cafetera = new Cafetera();
    public Cafetera llenarCafetera(){
        cafetera.setCapacidadMaxima(100);
        cafetera.setCapacidadActual(100);
        return cafetera;
    }
    
    
    public void servirTaza(int tamañoTaza){
        int totalCafetera = 0;
        if(cafetera.getCapacidadActual() > tamañoTaza){
            totalCafetera = cafetera.getCapacidadActual() - tamañoTaza;//quita la cantidad del cafe solicitado
            
            cafetera.setCapacidadActual(totalCafetera);//actualiza la cantidad de cafe actual
            System.out.println("Se servira el cafe");
        }else if(cafetera.getCapacidadActual() == 0){
            System.out.println("Cafetera Vacia... ");
        }else{
            System.out.println("Cantidad de cafe solicitado no disponible: Se servira el cafe restante en la cafetera ");
            cafetera.setCapacidadActual(0);//actualiza la cantidad de cafe actual
        }
    }
    
    public void vaciarCafetera(){
        cafetera.setCapacidadActual(0);
        System.out.println("Cafetera vaciada...");
    }
    
    
    public void cargarCafe(int cantidadCafe){
        int totalCafe;
        if(cantidadCafe > 100){
            System.out.println("Cantidad ingresada mayor a la capacidad maxima");
        }else{
            totalCafe = cafetera.getCapacidadActual() + cantidadCafe;
            if(totalCafe > 100){
                System.out.println("Esa cantidad superara la capacidad maxima...");
            }else{
                totalCafe = cafetera.getCapacidadActual() + cantidadCafe;
                cafetera.setCapacidadActual(totalCafe);
                System.out.println("Cafe cargado...");
            }
        }
    }
}
