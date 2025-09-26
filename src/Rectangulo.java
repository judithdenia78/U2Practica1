

/**
 * Clase donde calculas el area de un rectangulo
 * @author Judith Bartolome
 * @version 1.0
 */
public class Rectangulo {

    // Atributos donde se representa la base y la altura de un rectángulo
    private double base;
    private double altura;

    //Constructor

    /**
     * Te da los valores iniciales de base y altura
     * @param base base del rectángulo
     * @param altura altura del rectángulo
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //Métodos getters y setters

    /**
     * Devuelve el valor de la base del rectángulo
     * @return base del rectángulo
     */
    public double getBase () {
        return base;
    }

    /**
     * Permite modificar el valor de la base
     * @param base base nueva modificada
     */
    public void setBase (double base) {
        this.base = base;
    }

    /**
     * Devuelve el valor de la altura del rectángulo
     * @return altura del rectángulo
     */
    public double getAltura (){
        return altura;
    }

    /**
     * Permite modificar la altura del rectángulo
     * @param altura altura nueva modificada
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Método para calcular el área del rectángulo (base * altura)
     * @return área del rectángulo calculada
     */
    public double calculararea() {
        return base * altura;
    }
}
