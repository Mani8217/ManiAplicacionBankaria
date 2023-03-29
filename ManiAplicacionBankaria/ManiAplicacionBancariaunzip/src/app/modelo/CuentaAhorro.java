package app.modelo;
import app.modelo.Cuenta;
public abstract class CuentaAhorro extends Cuenta{
    //Atributos-------------------------------
    private Double SaldoAnterior;
    private double ingresos;
    private double retiros;


    //constructores-------------------------------


    public CuentaAhorro() {
    }

    public CuentaAhorro(String DNI, String nombre, String direccion) {
        super(DNI, nombre, direccion);
    }


    //metodos ---------------------------------

 //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++******
    @Override
    public double calcularSaldo() {
        return 0;
    }

    public double calcularSaldo(double TasaInteres) {
        double resultado = ((SaldoAnterior *  TasaInteres) + ingresos - retiros);
        return resultado;
    }
//***+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    @Override
    public String toString() {
        return super.toString();
    }


    //getters y Setters--------------------------------------------
    public Double getSaldoAnterior() {
        return SaldoAnterior;
    }

    public void setSaldoAnterior(Double saldoAnterior) {
        SaldoAnterior = saldoAnterior;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getRetiros() {
        return retiros;
    }

    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }
}
