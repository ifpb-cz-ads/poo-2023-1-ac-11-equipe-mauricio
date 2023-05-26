package AExercicio01;

import java.util.ArrayList;

public class AppPegadaDeCarbono {
    public static void main(String[] args) {
        ArrayList<PegadaDeCarbono> array= new ArrayList<>();
        Bicicleta bicicleta = new Bicicleta(true,50);
        Carro carro = new Carro(false, 100);
        Edificio edificio = new Edificio(10,100);

        array.add(bicicleta);
        array.add(carro);
        array.add(edificio);

        for (int i = 0; i < array.size(); i++){
            System.out.println(array.get(i).toString());
            System.out.println("Pegada de Carbono gerada: "+array.get(i).getPegadaDeCarbono());
        }

    }
}
