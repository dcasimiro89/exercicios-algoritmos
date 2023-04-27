package passo06;

import java.util.Scanner;

public class Ex63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mediaValor;
        int somaValor = 0;
        int menorNumero = 0;
        int quantidadeNumeroPar = 0;
        int quantidadeNumero = 0;

        do {
            System.out.print("Digite um número => ");
            int numero = sc.nextInt();
            somaValor += numero;
            quantidadeNumero++;

            if (numero % 2 == 0) {
                quantidadeNumeroPar++;
            }

            if (numero < menorNumero) {
                menorNumero = numero;
            }

            System.out.print("Deseja continuar cadastrando? [s/n] => ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'n') {
                break;
            } else {
                menorNumero = numero;
            }
        } while (true);

        mediaValor = somaValor / quantidadeNumero;
        System.out.println();
        System.out.println("O somatório entre todos os valores => " + somaValor);
        System.out.println("Qual foi o menor valor digitado => " + menorNumero);
        System.out.println("A média entre todos os valores => " + mediaValor);
        System.out.println("Quantos valores são pares => " + quantidadeNumeroPar);
    }
}
