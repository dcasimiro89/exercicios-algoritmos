package passo08;

import java.util.Scanner;

public class Ex84 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nome = new String[9];
        int[] idade = new int[nome.length];

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.println();
        }

        System.out.println("\nMenores de Idade");
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 18) {
                System.out.println("Nome: " +nome[i] + " | Idade: " + idade[i]);
            }
        }

    }
}
