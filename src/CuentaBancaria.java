/**
 * Clase donde creamos una cuenta bancaria e ingresamos y retiramos dinero.
 * @author Judith Bartolome
 * @version 1.0
 */

public class CuentaBancaria {

    //Atributos de la cuenta bancaria
    private String titular;
    private double saldo = 0.0;

    //Constructor de la clase

    /**
     * Establece los valores de la cuenta bancaria de x persona y sus movimientos
     * @param titular
     * @param ingresar
     * @param retirar
     */
    public CuentaBancaria(String titular, double ingresar, double retirar) {
        this.saldo = saldo;
        this.titular = titular;
    }

    // Métodos gettes y setters

    /**
     * Devuelve el nomnbre del titular de la cuenta
     * @return nombre titular de la cuenta
     */
    public String getTitular () {
        return titular;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return saldo cuenta bancaria
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Permite modificar el titular de la cuenta
     * @param titular
     */
    public void setTitular (String titular) {
        this.titular = titular;
    }

    //Métodos de acciones de la cuenta
    public void CuentaBancaria(String titular, double ingresar, double retirar) {
        this.titular = titular;
        this.saldo = 0.0;
        ingresar(ingresar);
        retirar(retirar);
    }

    /**
     * Método de retiro de una cantidad de la cuenta
     * @param retiro
     */
    public void retirar (double retiro) {
        this.saldo = this.saldo - retiro;
    }

    /**
     * Método de ingreso de una cantidad de dinero de la cuenta
     * @param ingreso
     */
    public void ingresar (double ingreso) {
        this.saldo = this.saldo + ingreso;
    }

    /**
     * Muestra por pantalla la información de la cuenta (titular y saldo)
     */
    public void mostrarInformacion() {
        System.out.println("El titular de la cuenta es: " + titular);
        System.out.println("El saldo de la cuenta es: " + saldo);
    }

}


