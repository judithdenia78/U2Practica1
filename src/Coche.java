public class Coche {
    private double velocidad;

    public  Coche(){}
    public Coche(double velocidad){
        this.velocidad = velocidad;
    }

    public void setVelocidad(double velocidad){
        this.velocidad = velocidad;
    }
    public double getVelocidad(){
        return this.velocidad;
    }

    public void acelerar(){
        this.velocidad++;//this.acelerar = this.velocidad + 1;
    }
    public void frenar(){
        this.velocidad--;
    }
}
