/**
 * Clase donde establecer si un alumno ha aprobado (true)o no (false)
 * @author Judith Bartolomé
 * @version 1.0
 */


public class Alumno {

    //Establece los datos del alumno

    private String nombre;
    private double nota;

    //Constructor de la clase
    /**
     * Parámetros que necesitamos para rellenar los datos del alumno
     * @param nombre
     * @param nota
     */
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Métodos de getters y setters
    /**
     * Parámetro que devuelve el nombre del alumno
     * @return nombre
     */
    public String getNombre () {
        return nombre;
    }

    /**
     * Parámetro que devuelve la nota del alumno
     * @return nota
     */
    public double getNota () {
        return nota;
    }

    /**
     * Permite modificar el nombre del alumno
     * @param
     */
    public void setNombre () {
        this.nombre = nombre;
    }

    /**
     * Permite modificar la nota del alumno
     * @param
     */
    public void setNota () {
        this.nota = nota;
    }

    /**
     * Método para comrprobar e indicar si el alumno ha aprobado
     * @return true or false
     */
    public boolean aprobado () {
        return nota >=5;
    }

    /**
     * Método para mostrar por pantalla los datos y notas del alumno
     */
    public void mostrarInformacion() {
        System.out.println("El nombre del alumno es : " + nombre + " y su nota es: " + nota);
        System.out.println("¿Ha aprobado? " + aprobado());
    }
}
