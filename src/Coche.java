/**
 * Clase que te dice la velocidad si aceleras y frenas.
 * @author Judith Bartolome
 * @version 1.0
 */

public class Coche {
    //Atributo que define la velocidad del coche
    private double velocidad;

    //Constructor

    /**
     * Establece la velocidad del coche
     * @param velocidad
     */
    public Coche(double velocidad){
        this.velocidad = velocidad;
    }

    //Métodos getters y setters

    /**
     * Permite modificar la velocidad del coche
     * @param velocidad
     */
    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }

    /**
     * Devuelve la velocidad del coche
     * @return velocidad del coche
     */
    public double getVelocidad(){
        return this.velocidad;
    }

    //Métodos que indican que quiere hacer el coche

    /**
     * Aumenta la velocidad del coche
     */
    public void acelerar(){
        this.velocidad++;//this.acelerar = this.velocidad + 1;
    }

    /**
     * Disminuye la velocidad del coche
     */
    public void frenar(){
        this.velocidad--;
    }
}
