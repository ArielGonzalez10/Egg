/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.

 */
package Entidad;

import Interfaces.gastoTotal;
import java.util.ArrayList;



public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        
    }
    
    
    public Lavadora(int carga, float precio, float peso, String color, String consEnergetico) {
        super(precio, peso, color, consEnergetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getConsEnergetico() {
        return consEnergetico;
    }

    @Override
    public void setConsEnergetico(String consEnergetico) {
        this.consEnergetico = consEnergetico;
    }

    
    
    
    @Override
    public void consumoEnergetico(String letra) {
        if(!letra.equals("A") || letra.equals("B")|| letra.equals("C")|| letra.equals("D")|| letra.equals("E")){
            this.color = "blanco";
        }
    }

    @Override
    public void comprobarColor(String color) {
        if(!color.equals("negro") || color.equals("rojo")|| color.equals("azul")|| color.equals("gris")){
            this.color = "blanco";
        }
    }

    public float precioFinal(Electrodomestico electro) {
        float precioFinal = 1000;
        
        //aumento  segun carga
        if(this.carga > 30 ){
            precioFinal += 500;
        }
        
        //aumento segun peso de la lavadora
        if(electro.getPeso() <= 19){
            precioFinal += 100;
        }else if(electro.getPeso() <= 49){
            precioFinal += 500;
        }else if(electro.getPeso() <= 79){
            precioFinal += 800;
        }else{
            precioFinal += 1000;
        }
        
        //aumento segun el consumo energetico
        switch(electro.getConsEnergetico()){
            case "A":
                precioFinal += 1000;
                break;
            case "B":
                precioFinal += 800;
                break;
            case "C":
                precioFinal += 600;
                break;
            case "D":
                precioFinal += 500;
                break;
            case "E":
                precioFinal += 300;
                break;
            default:
                precioFinal += 100;
                break;
        }
        return precioFinal;
    }

    @Override
    public void crearElectrodomestico(float precio, float peso, String color, String consEnergetico) {
        
        this.peso = peso;
        
       
        this.carga = carga;
        
       
        this.color = color;
        
        
        this.consEnergetico = consEnergetico;
    }

    @Override
    public String toString() {
        return "Lavadora( color: " + color +" Precio final: "+precio+" Consumo Energetico: "+consEnergetico+ ')';
    }

    @Override
    public float calculoImporteTotal(ArrayList<Electrodomestico> elec) {
        float precioTotal = 0;
        System.out.println("Precio de la lavadora: "+precio);
        for (Electrodomestico electrodomestico : elec) {
            precioTotal +=electrodomestico.getPrecio();
        }
        return precioTotal;
        
    }

    
}   
