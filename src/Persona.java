/**
 * Clase donde establecemos los datos de un alumno.
 * @author Judith Bartolome
 * @version 1.0
 */

public class Persona {

    //Establecemos los datos del alumno como atributos

    private String nombre;
    private int edad;

    //Constructores

    /**
     * Establecemos los parámetros que necesitamos para rellenar los datos del alumno
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    // Métodos de getters y setters
    /**
     * Parametro que te devuelve el  nombre del alumno
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Parametro que te devuelve la edad del alumno
     * @return edad
     */
    public int getEdad (){
        return edad;
    }

    /**
     * Permite modificar el nombre del alumno
     * @param
     */
    public void setNombre () {
        this.nombre = nombre;
    }

    /**
     * Permite modificar la edad del alumno
     * @param
     */
    public void setEdad () {
        this.edad = edad;
    }

    /**
     * Muestra por pantalla el nombre y la edad del alumno
     */
    public void mostrarInformacion() {
        System.out.println("El nombre del persona es: " + nombre +"y su edad es: " + edad);

    }

}
