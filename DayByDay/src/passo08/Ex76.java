package passo08;

import java.util.Random;

public class Ex76 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] matriz = new int[7];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = random.nextInt(100);
            System.out.print(matriz[i] + " ");
        }
    }
}
