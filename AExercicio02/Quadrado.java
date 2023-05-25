package AExercicio02;

public class Quadrado extends Quadrilatero{
    private double lado;

    public Quadrado(double lado) {
       super(lado,lado,lado,lado);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public String toString() {
        return "Quadrado [" +
                "lado= " + lado +
                ", perimetro= " + calcularPerimetro() +
                ", area=" + calcularArea() + "]";
    }
}
