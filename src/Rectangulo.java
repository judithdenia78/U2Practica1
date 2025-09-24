import org.w3c.dom.css.Rect;

/**
 * Clase donde calculas el area de un rectangulo
 * @author Judith Bartolome
 * @version 1.0
 */
public class Rectangulo {


    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getBase () {
        return base;
    }
    public void setBase (double base) {
        this.base = base;
    }
    public double getAltura (){
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calculararea() {
        return base * altura;
    }
}
