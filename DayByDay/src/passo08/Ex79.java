package passo08;

import java.util.Scanner;

public class Ex79 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("numero["+i+"]: ");
            numero[i] = sc.nextInt();
        }

        System.out.print("\nNúmeros pares: ");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.print(numero[i] + " ");
            }
        }

        System.out.print("\nPosições: ");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
