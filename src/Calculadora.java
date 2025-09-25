/**
 * Clase donde se realiza distintas operaciones
 * @author Judoth Bartolome
 * @version 1.0
 */
public class Calculadora {

    // Atributos de los números que  vamos a utilizar
    private int num1;
    private int num2;

    /**
     * Constructor que establece los parámetros de num1 y num2
     * @param num1
     * @param num2
     */
    public Calculadora (int num1 , int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // Métodos de getters y setters
    /**
     * Devuelve el valor de num1
     * @return valor num1
     */
    public int getNum1 () {
        return num1;
    }

    /**
     * Permite modificar el num1
     * @param num1
     */
    public void setNum1 (int num1) {
        this.num1 = num1;
    }

    /**
     * Devuelve el valor de num2
     * @return valor num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Permite modificar el valor de num2
     * @param num2
     */
    public void setNum2 (int num2) {
        this.num2 = num2;
    }

    /**
     * Método que calcula la suma
     * @return devuelve el resultado de la suma
     */
    public int sumar () {
        return num1 + num2;
    }

    /**
     * Método que calcula la resta
     * @return devuele el resultado de la resta
     */
    public int restar () {
        return  num1 - num2;
    }

    /**
     * Método que calcula la multiplicación
     * @return devuelve el resultado de la multiplicación
     */
    public int multiplicar () {
        return num1 * num2;
    }

    /**
     * Método que calcula la división
     * @return devuelve el resultado de la división
     */
    public int dividir () {
        return num1 / num2;
    }


}