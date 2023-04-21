package passo05;

import java.util.Scanner;

public class Ex56 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int opcao = 1111;

        while (true) {
            System.out.print("Digite um número => ");
            int numero = sc.nextInt();
            if (numero == opcao) {
                break;
            } else {
                soma += numero;
            }
        }

        System.out.println("\nSoma total dos números digitados: " + soma);
    }
}
