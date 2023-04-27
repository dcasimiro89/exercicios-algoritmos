package passo06;

import java.util.Scanner;

public class Ex62 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeIdade = 0;
        int mediaIdade;
        int somaIdade = 0;
        int idadeAcima21anos = 0;

        do {
            System.out.print("Digite sua idade => ");
            int idade = sc.nextInt();
            somaIdade += idade;

            if (idade > 21) {
                idadeAcima21anos++;
            }
            quantidadeIdade++;

            System.out.print("Deseja continuar cadastrando? [s/n] => ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'n') {
                break;
            }
        } while (true);

        mediaIdade = somaIdade / quantidadeIdade;
        System.out.println();
        System.out.println("Quantas idades foram digitadas => " + quantidadeIdade);
        System.out.println("Qual é a média entre as idades digitadas => " + mediaIdade);
        System.out.println("Quantas pessoas tem 21 anos ou mais => " + idadeAcima21anos);
    }
}
