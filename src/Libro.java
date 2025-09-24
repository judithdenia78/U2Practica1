import javax.xml.transform.SourceLocator;
/**
 *Clase donde nos pide que ingresemos los datos de un libro
 * @author Judith Bartolome
 * @version 1.0
 */
public class Libro {

    public String titulo;
    public String autor;
    public int paginas;

    public Libro (String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getTitulo () {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getPaginas () {
        return paginas;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        this.paginas= paginas;
    }
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + paginas);
    }

}
