/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3refactorizado;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.provider.CsvSource;


/**
 *
 * 
 * @version 1.0
 *  
 *@autor Jorge Garea Rodriguez
 *@fecha 22/05/2024
 *@param CCuenta clase principal del proyecto donde esta todo el codigo
 */
public class CCcuenta {

    /**
     * @param args the command line arguments
     * @param main metodo main donde se realizan las consultas o operaciones
     * 
     */
    
    public double dSaldo;
    public String nombre;

    public static void main(String[] args) {

        CCuenta Cuenta1 = new CCuenta();
        

        System.out.println("Saldo Incial: " + Cuenta1.dSaldo + " euros");

        Cuenta1.ingresar(-100);
        System.out.println("Saldo Incial: " + Cuenta1.dSaldo + " euros");
        Cuenta1.ingresar(100);
        System.out.println("Saldo tras ingreso: " + Cuenta1.dSaldo + " euros");
        Cuenta1.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + Cuenta1.dSaldo + " euros");

        Cuenta1.ingresar(300);
        System.out.println("Saldo tras ingreso: " + Cuenta1.dSaldo + " euros");
        Cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + Cuenta1.dSaldo + " euros");
    }

    /** Metodo para ingresar cantidades en la cuenta. Modifica el saldo. 
    *@param ingresar (metodo)sobre la cuenta en la que se trabaja
    *@autor Jorge Garea Rodriguez
    *@fecha 22/05/2024
    */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (!(cantidad >= 0 || cantidad <= 3000)) {
            System.out.println("No se puede ingresar una cantidad negativa ni superior a 3000€ (sin ser notificada con formulario)");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        } else {
            dSaldo = dSaldo + cantidad;
            iCodErr = 0;
        }

        return iCodErr;
    }

    /**
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
    *@param retirar (metodo)cantidad sobre la cuenta en la que se opera
    *@autor Jorge Garea Rodriguez
    *@fecha 22/05/2024
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (dSaldo < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            dSaldo = dSaldo - cantidad;
            System.out.println("Le quedan " + dSaldo + " en cuenta");
        }
    }
    /**
     * Método que realiza operaciones de retiro e ingreso en una cuenta.
     *@param operativa_cuenta (metodo)operaciones que se van a realizar sobre la cuenta en la que se opera
     * @param cuenta1 la cuenta sobre la que se opera
     * @param cantidad la cantidad a ingresar
     *@autor Jorge Garea Rodriguez
     * @fecha 22/05/2024
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
    }

    private static class CCuenta {

        private String dSaldo;

        public CCuenta() {
        }

        private double estado() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void retirar(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void ingresar(float cantidad) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
