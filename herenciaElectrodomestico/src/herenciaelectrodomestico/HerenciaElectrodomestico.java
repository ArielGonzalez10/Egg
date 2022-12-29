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
usa el color blanco por defecto. 
Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. 
No importa si el nombre está en mayúsculas o en
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
package herenciaelectrodomestico;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;


public class HerenciaElectrodomestico {

    public static void main(String[] args) {
        Lavadora lavad = new Lavadora();
        Televisor telev = new Televisor();
        Televisor telev1 = new Televisor();
        ArrayList<Electrodomestico> listaElectro = new ArrayList();
        
        //Crea una lavadora
        lavad.crearElectrodomestico(1000, 50, "violeta", "A");
        lavad.setCarga(50);
        
        lavad.comprobarColor(lavad.getColor());
        lavad.consumoEnergetico(lavad.getConsEnergetico());
        
        //Crea un televisor
        telev.crearElectrodomestico(1000, 42, "negro", "B");
        telev.setResolucion(45);
        telev.setSintonizadorTdt(true);
        
        //Crea un televisor
        telev1.crearElectrodomestico(1000, 500, "gris", "C");
        telev1.setResolucion(43);
        telev1.setSintonizadorTdt(false);
        
        //Calcula los precios finales
        lavad.setPrecio(lavad.precioFinal(lavad));
        telev.setPrecio(telev.precioFinal(telev));
        telev1.setPrecio(telev1.precioFinal(telev1));
        
        //añade a la lista
        listaElectro.add(lavad);
        listaElectro.add(telev);
        listaElectro.add(telev1);
        
        for (Electrodomestico list : listaElectro) {
            System.out.println(" "+list.toString());
        }
        
        for (Electrodomestico list : listaElectro) {
            System.out.println("Precio Total: "+list.calculoImporteTotal(listaElectro));
        }
    }
    
}
