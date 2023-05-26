package AExercicio01;

public class Bicicleta implements PegadaDeCarbono{
    private Boolean eletrica;
    private int KmRodado;

    public Bicicleta(Boolean eletrica, int kmRodado) {
        this.eletrica = eletrica;
        KmRodado = kmRodado;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "É ELÉTRICA?" + eletrica +
                ", Km RODADOS POR MÊS:=" + KmRodado +
                '}';
    }

    @Override
    public double getPegadaDeCarbono() {
        if(eletrica){
            return KmRodado * 0.0005;
        }
        else {
            return 0;
        }
    }
}
