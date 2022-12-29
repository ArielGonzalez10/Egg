/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package Entidad;

import Interfaces.gastoTotal;
import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public  abstract class Electrodomestico implements gastoTotal{
    protected float precio = 1000;
    protected float peso;
    protected String color;
    protected String consEnergetico;

    public Electrodomestico(float precio, float peso, String color, String consEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consEnergetico = consEnergetico;
    }

    public Electrodomestico() {
        
    }
    
    
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsEnergetico() {
        return consEnergetico;
    }

    public void setConsEnergetico(String consEnergetico) {
        this.consEnergetico = consEnergetico;
    }
    
    public abstract void consumoEnergetico(String letra);
    
    public abstract void comprobarColor(String color);
    
    public abstract void crearElectrodomestico(float precio, float peso, String color, String consEnergetico);
    public abstract float calculoImporteTotal(ArrayList<Electrodomestico> elec);
}
