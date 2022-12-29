/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidad.Cuenta;
import java.util.Scanner;
/**
 *
 * @author Ariel
 */
public class servicios {
    Cuenta cuenta = new Cuenta();
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta(){
        System.out.println("Ingrese el nro de cuenta: ");
        cuenta.setNroCuenta(leer.nextInt());
        
        System.out.println("Ingrese el nro de dni: ");
        cuenta.setDni(leer.nextLong());
        
        System.out.println("Ingrese una cantidad de dinero inicial: ");
        cuenta.setSaldo(leer.nextFloat());
        return cuenta;
    }
    
    
    public void ingresar(float ingreso){
        float saldoIngreso = ingreso + cuenta.getSaldo();
        cuenta.setSaldo(saldoIngreso);
        System.out.println("Dinero ingresado: "+ingreso);
    }
    
    public void retirar(float retiro){
        float saldoRetiro = cuenta.getSaldo() - retiro;
        cuenta.setSaldo(saldoRetiro);
        System.out.println("Dinero Retirado: "+retiro);
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo en cuenta: "+cuenta.getSaldo());
    }
    
    public void retiroRapido(){
        System.out.println("Solo puede retirar el 20% del saldo: ");
        float saldoRetiro = (cuenta.getSaldo() * 20) / 100;
        float saldoFinal = cuenta.getSaldo() - saldoRetiro;
        cuenta.setSaldo(saldoFinal);
        System.out.println("Dinero retirado: "+saldoRetiro);
    }
    
    public void mostrarDatos(){
        System.out.println("Nro de Cuenta: "+cuenta.getNroCuenta());
        System.out.println("Nro de Dni: "+cuenta.getDni());
        System.out.println("Saldo: "+cuenta.getSaldo());
    }
    
}
