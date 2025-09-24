public class CuentaBancaria {

    private double saldo;
    private String titular;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular () {
        return titular;
    }
    public void setTitular (String titular) {
        this.titular = titular;
    }


}
