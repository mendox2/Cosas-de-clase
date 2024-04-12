package PatioDeJuegos;

import java.util.Scanner;

public class ArraysEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 7;
        String carros[] = new String[size];
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Agrege el nombre del carro: " + (i + 1));
            carros[i] = scanner.nextLine();
        }
        for (String x : carros) {
            System.out.println(x);
        }

    }
}
