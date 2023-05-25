package AExercicio01;

public class Edificio implements PegadaDeCarbono{
    private int quantidadeApartamento;
    private double kWhMedio;

    public Edificio(int numApartamento, double kWhMedio) {
        this.quantidadeApartamento = numApartamento;
        this.kWhMedio = kWhMedio;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "QUANTIDADE DE APARTAMENTOS DO EDIFICIO=" + quantidadeApartamento +
                ", kWh POR MÊS MÉDIO DOS APARTAMENTOS=" + kWhMedio +
                '}';
    }

    @Override
    public double getPegadaDeCarbono() {
        return quantidadeApartamento * (kWhMedio * 0.0750);
    }
}
