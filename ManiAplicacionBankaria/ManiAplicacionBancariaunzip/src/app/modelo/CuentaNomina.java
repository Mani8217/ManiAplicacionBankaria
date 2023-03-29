package app.modelo;

public abstract class CuentaNomina extends CuentaAhorro{

    //Atributos-------------------------------------
    private String SS;
    private String Empresa;
    private double comision;



    //constructores----------------------------------
    public CuentaNomina() {
    }

    public CuentaNomina(String DNI, String nombre, String direccion) {
        super(DNI, nombre, direccion);
    }

    //metodos----------------------------------------------
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++*****************++
    @Override
    public double calcularSaldo(double TasaInteres) {
        return super.calcularSaldo(TasaInteres);
    }

   public double calcularSaludo(){
       return (getIngresos() + getSaldoAnterior()) - getRetiros();
   }
 //****************************************************************************************

    //getters y setters--------------------------------

    public String getSS() {
        return SS;
    }

    public void setSS(String SS) {
        this.SS = SS;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }


}
