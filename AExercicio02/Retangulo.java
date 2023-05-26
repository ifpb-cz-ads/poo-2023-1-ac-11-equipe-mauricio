package AExercicio02;

public class Retangulo extends Quadrilatero{
    public double altura;
    public double base;

    public Retangulo(double altura, double base) {
        super(altura,altura,base,base);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea() {
        return base * altura;
    }

    public String toString() {
        return "Retangulo [" +
                "altura= " + altura +
                ", base=" + base +
                ", perimetro= " + calcularPerimetro() +
                ", area=" + calcularArea() + "]";
    }
}
