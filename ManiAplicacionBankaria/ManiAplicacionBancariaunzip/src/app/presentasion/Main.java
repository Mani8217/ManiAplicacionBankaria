package app.presentasion;

import app.modelo.Cuenta;
import app.modelo.CuentaAhorro;
import app.modelo.CuentaNomina;

public class Main {
    public static void main(String[] args) {
     Cuenta cA = new CuentaAhorro("y322x" , "Mani" , "Madrid") {
         @Override
         public double calcularSaldo(double TasaInteres) {
             return super.calcularSaldo(TasaInteres);
         }
     };
        System.out.println(cA.toString());
    }

}