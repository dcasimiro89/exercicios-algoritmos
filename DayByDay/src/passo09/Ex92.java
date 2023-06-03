package passo09;

import java.util.Scanner;

public class Ex92 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para saber se é par ou ímpar => ");
        int numero = sc.nextInt();

        parOuImpar(numero);
    }

    public static void parOuImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}
