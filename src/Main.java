
public class Main {
    public static void main(String[] args) {

        //Persona
        Persona persona1 = new Persona("Judith", 25);
        persona1.mostrarInformacion();

        //Calculo Rectángulo
        Rectangulo rectangulo = new Rectangulo(2, 5);
        System.out.println("El área de un rectángulo es: " + rectangulo.calculararea());

        //Cuenta Bancaria

        CuentaBancaria cuenta1 = new CuentaBancaria("Judith Bartolome", 100, 50);
        cuenta1.mostrarInformacion();


        //Ccche
        Coche coche1 = new Coche (50);
        System.out.println("Velocidad inicial: " + coche1.getVelocidad());

        coche1.acelerar();
        System.out.println("Velocidad después de acelerar: " + coche1.getVelocidad());

        coche1.frenar();
        System.out.println("Velocidad después de frenar: " + coche1.getVelocidad());

        //Libro

        Libro libro1 = new Libro("Orgullo y Prejuicio" , "Jane Austen" , 852);
        libro1.mostrarInformacion();

        // Calculo raiz cuadrada

        PotenciaYRaiz raizCuadrada = new PotenciaYRaiz(3);
        double resultadoRaizCuadrada = raizCuadrada.calcularRaizCuadrada();
        System.out.println("La raiz cuadrada de 3 es " + resultadoRaizCuadrada);

        // Calculo de la potencia

        PotenciaYRaiz potencia = new PotenciaYRaiz(5);
        double resultadoPotencia = potencia.calcularPotencia(2);
        System.out.println("La potencia de 5 es: " + resultadoPotencia);

        //Alumno

        Alumno alumno1 = new Alumno("Judith Bartolomé", 8);
        alumno1.mostrarInformacion();

        //Circulo

        Circulo circulo1 = new Circulo(5);
        System.out.println("El radio del circulo es: " + circulo1.getRadio() + ", por lo que el calculo del area es: " + circulo1.calcularArea());

        //Calculadora
        Calculadora calculadora1 = new Calculadora(5 , 20);
        System.out.println("El primer número es: " + calculadora1.getNum1());
        System.out.println("El segundo número es: " + calculadora1.getNum2());

        System.out.println("El resultado de la suma es: " + calculadora1.sumar());
        System.out.println("El resultado de la resta es: " + calculadora1.restar());
        System.out.println("El resultado de la multiplicación es: " + calculadora1.multiplicar());
        System.out.println("El resultado de la división es: " + calculadora1.dividir());
    }
}
