public class PotenciaYRaiz {
    private int numero;

    public PotenciaYRaiz() {};

    public PotenciaYRaiz(int numero) {
        this.numero = numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return this.numero;
    }

    public double calcularRaizCuadrada() {
        return Math.sqrt(this.numero);
    }

    public double calcularPotencia(int potencia) {
        return Math.pow(this.numero, potencia);
    }

}
