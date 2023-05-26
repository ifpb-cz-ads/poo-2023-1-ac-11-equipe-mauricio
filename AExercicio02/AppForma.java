package AExercicio02;

import java.util.ArrayList;

public class AppForma {
    public static void main(String[] args) {

        ArrayList<Forma> array = new ArrayList<>();

        Quadrado quadrado = new Quadrado(2);
        Retangulo retangulo = new Retangulo(3, 2);
        Circulo circulo = new Circulo(1);

        array.add(quadrado);
        array.add(retangulo);
        array.add(circulo);

        for (int i = 0; i<array.size(); i++){
            System.out.println(array.get(i).toString());
        }
    }
}
