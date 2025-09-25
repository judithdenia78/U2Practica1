/**
 * Clase donde calculamos la Potencia y la Raiz Cuadrada de un numero
 * @author  Judith Bartolome
 * @version 1.0
 */

public class PotenciaYRaiz {

    //Atributo que elegimos para realizar los cáculos
    private int numero;

    //Constuctor de la clase

    /**
     * Inicia el número con el que realizamos las operaciones
     * @param numero
     */
    public PotenciaYRaiz(int numero) {
        this.numero = numero;
    }

    //Métodos getters y setters

    /**
     * Permite modificar el número
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el valor del número
     * @return número elegido
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Método de calcula la raíz cuadrada del número
     * @return raíz cuadrada
     */

    public double calcularRaizCuadrada() {
        return Math.sqrt(this.numero);
    }

    /**
     * Método que calcula la potencia del número elevado
     * @param potencia
     * @return número elevado a esa potencia
     */
    public double calcularPotencia(int potencia) {
        return Math.pow(this.numero, potencia);
    }

}
