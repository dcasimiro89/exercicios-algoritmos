package diariamente;

import java.util.Random;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] lista = new int[3][3];

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                //System.out.print("Número: ");
                lista[i][j] = random.nextInt(50);
            }
        }

        System.out.println("\nImpressão da Lista");
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                System.out.print(lista[i][j] + " ");
            }
        }

        System.out.println("\n\nMain Diagonal");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i][i] + " ");
        }

        sc.close();
    }
}
