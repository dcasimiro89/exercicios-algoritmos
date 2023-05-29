package passo08;

import java.util.Random;

public class Ex83 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numero = new int[20];

        System.out.print("Numero: ");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(99);
            System.out.print(numero[i] + " ");
        }

        System.out.print("\nNúmero crescente: ");
        for (int i = 0; i < numero.length; i++) {
            for (int j = i+1; j < numero.length; j++) {
                if (numero[i] > numero[j]) {
                    int aux = numero[j];
                    numero[j] = numero[i];
                    numero[i] = aux;
                }
            }
            System.out.print(numero[i] + " ");
        }

    }
}
