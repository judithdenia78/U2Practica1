/**
 * Clase donde se calcula el área de un círculo
 * @author Judith Bartolomé
 * @version 1.0
 */
public class Circulo {

    // Atributos que representa el radio y el número pi no cambiable
    private double radio;
    private final double PI = 3.14; // Es una variable que no cambia y por eso se le dice final

    // Constructor de la clase

    /**
     * Establece el valor del radio del círculo
     * @param radio valor inicial del radio del círculo
     */
    public Circulo(double radio) {
        this.radio=radio;
    }

    //Métodos de getters y setters

    /**
     * Devuelve el valor del radio
     * @return radio del círculo
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Permite modificar el valor del radio del círculo
     * @param radio nuevo valor del radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Método que calcula el área del círculo (PI * radio * radio)
     * @return área del círculo calculado
     */
    public double calcularArea () {
        return PI * radio * radio;
    }
}
