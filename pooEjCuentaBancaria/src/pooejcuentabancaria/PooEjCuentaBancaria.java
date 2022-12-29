/*
 Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooejcuentabancaria;
import java.util.Scanner;
import Entidad.Cuenta;
import Servicios.servicios;
/**
 *
 * @author Ariel
 */
public class PooEjCuentaBancaria {

   
    public static void main(String[] args) {
        Cuenta obj1 = new Cuenta();
        servicios serv = new servicios();
        
        Scanner leer = new Scanner(System.in);
        
        obj1 = serv.crearCuenta();
        
        System.out.println("Ingrese la cantidad de plata que desea guardar: ");
        serv.ingresar(leer.nextFloat());
        
        serv.mostrarSaldo();
        serv.mostrarDatos();
        System.out.println("Ingrese la cantidad de plata que desea retirar: ");
        serv.retirar(leer.nextFloat());
        
        serv.mostrarSaldo();
        serv.mostrarDatos();
        
        serv.retiroRapido();
        
        serv.mostrarSaldo();
        serv.mostrarDatos();
        
        
        
    }
    
}
