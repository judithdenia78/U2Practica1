/**
 * Clase donde creamos una cuenta bancaria e ingresamos y retiramos dinero.
 * @author Judith Bartolome
 * @version 1.0
 */

public class CuentaBancaria {

    private String titular;
    private double saldo = 0.0;

    public CuentaBancaria(String titular, double ingresar, double retirar) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public String getTitular () {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setTitular (String titular) {
        this.titular = titular;
    }
    public void CuentaBancaria(String titular, double ingresar, double retirar) {
        this.titular = titular;
        this.saldo = 0.0;
        ingresar(ingresar);
        retirar(retirar);
    }
    public void retirar (double retiro) {
        this.saldo = this.saldo - retiro;
    }
    public void ingresar (double ingreso) {
        this.saldo = this.saldo + ingreso;
    }

    public void mostrarInformacion() {
        System.out.println("El titular de la cuenta es: " + titular);
        System.out.println("El saldo de la cuenta es: " + saldo);
    }

}


