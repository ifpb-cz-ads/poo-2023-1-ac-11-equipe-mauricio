package AExercicio01;

public class Carro implements PegadaDeCarbono{
    private Boolean eletrico;
    private int KmRodado;

    public Carro(Boolean eletrico, int kmRodado) {
        this.eletrico = eletrico;
        KmRodado = kmRodado;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "É ELÉTRICO?" + eletrico +
                ", Km RODADOS POR MÊS=" + KmRodado +
                '}';
    }

    @Override
    public double getPegadaDeCarbono() {
        if (eletrico){
            return KmRodado * 0.0106;
        }
        else {
            return  KmRodado * 0.1280;
        }
    }
}
