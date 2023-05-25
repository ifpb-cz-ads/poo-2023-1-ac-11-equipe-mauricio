package AExercicio02;

public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * raio * raio;
    }
    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }

    @Override
    public String toString() {
        return "Circulo [" +
                "raio= " + raio +
                ", perimetro= " + calcularPerimetro() +
                ", area=" + calcularArea() + "]";
    }
}
