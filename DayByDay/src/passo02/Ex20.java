package passo02;

import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        boolean numeroPar = numero % 2 == 0;
        if (numeroPar) {
            System.out.println("Número " + numero + " é par!");
        } else {
            System.out.println("Número " + numero + " é ímpar!");
        }
    }
}
