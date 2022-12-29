/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package Entidad;

import java.util.ArrayList;


public class Televisor extends Electrodomestico {
    private float resolucion;
    private boolean sintonizadorTdt = false;

    public Televisor() {
        
    }

    public Televisor(float resolucion, float precio, float peso, String color, String consEnergetico) {
        super(precio, peso, color, consEnergetico);
        this.resolucion = resolucion;
    }


    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTdt() {
        return sintonizadorTdt;
    }

    public void setSintonizadorTdt(boolean sintonizadorTdt) {
        this.sintonizadorTdt = sintonizadorTdt;
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     *
     * @return
     */
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
         switch(letra){
            case "A":
                this.precio = 1000;
                break;
            case "B":
                this.precio = 800;
                break;
            case "C":
                this.precio = 600;
                break;
            case "D":
                this.precio = 500;
                break;
            case "E":
                this.precio = 300;
                break;
            default:
                this.consEnergetico = "F";
                precio = 100;
                break;
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
        
        
        //aumento  segun sintonizador
        if(this.sintonizadorTdt == true){
            precioFinal += 500;
        }
        
        //aumento segun peso del televisor
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
        
        //aumento  segun pulgadas
        if(this.resolucion > 40){
            float porcentajeAumento = (precioFinal * 30) / 100;
            System.out.println("Porcentaje de aumento: 30%");
            System.out.println("Total porcentaje: "+porcentajeAumento);
            precioFinal += porcentajeAumento;
        }
        
        return precioFinal;
    }

    @Override
    public void crearElectrodomestico(float pPrecio, float pPeso, String pColor, String pConsEnergetico) {//crea los valores 
        precio = pPrecio;
        
        color = pColor;
        
        consEnergetico = pConsEnergetico;
       
        peso = pPeso;
        
    }

    @Override
    public String toString() {
        return "Televisor("+  "Color:" + color +" Peso:" + peso + " Consumo Energetico:" + consEnergetico + ", Precio final:"+precio + " Resolucion:" + resolucion + " Sintonizador Tdt:" + sintonizadorTdt + ')';
    }

    @Override
    public float calculoImporteTotal(ArrayList<Electrodomestico> elec) {//recorre una lista de electrodomesticos, suma y almacena en los precios unitarios en la variable precioTotal
        float precioTotal = 0;
        System.out.println("Precio del televisor: "+precio);
        for (Electrodomestico electrodomestico : elec) {
            precioTotal +=electrodomestico.getPrecio();
        }
        return precioTotal;
        
    }

}
