/**
 * Clase donde nos dan los datos de un alumno.
 * @author Judith Bartolome
 * @version 1.0
 */

public class Persona {
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad (){
        return edad;
    }

    public void setNombre () {
        this.nombre = nombre;
    }

    public void setEdad () {
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("El nombre del persona es: " + nombre +"y su edad es: " + edad);

    }

}
