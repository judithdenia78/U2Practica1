import javax.xml.transform.SourceLocator;
/**
 *Clase donde nos pide que ingresemos los datos de un libro
 * @author Judith Bartolome
 * @version 1.0
 */
public class Libro {

    //Atributos o datos del libro que elegimos
    public String titulo;
    public String autor;
    public int paginas;

    //Constructor de la clase

    /**
     * Datos que neceisitamos para rellenar los datos del libro
     * @param titulo
     * @param autor
     * @param paginas
     */
    public Libro (String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Métodos getters y setters

    /**
     * Devuelve el título del libro
     * @return título libro
     */
    public String getTitulo () {
        return titulo;
    }

    /**
     * Devuelve el autor del libro
     * @return autor libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Devuelve las páginas que tiene el libro
     * @return páginas libro
     */
    public int getPaginas () {
        return paginas;
    }

    /**
     * Permite modificar el título del libro
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Permite modificar el autor del libro
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Permite modificar las páginas del libro
     * @param paginas
     */
    public void setPaginas(int paginas) {
        this.paginas= paginas;
    }

    /**
     * Método para mostar la información del libro
     * Muestra por pantalla toda la información (titulo, autor y páginas)
     */
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }

}
