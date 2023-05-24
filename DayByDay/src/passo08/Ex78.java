package passo08;

import java.util.Scanner;

public class Ex78 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número["+i+"]: ");
            numeros[i] = sc.nextInt();
        }

        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == 0) {
                System.out.println("Posição: " + i);
            }
        }

    }
}
