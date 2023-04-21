package passo05;

import java.util.Scanner;

public class Ex58 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double somaIdade = 0.0;
        double mediaIdade;
        int quantidadeAluno = 0;

        while (true) {
            System.out.print("Digite sua idade => ");
            int idade = sc.nextInt();

            if (idade == 999) {
                break;
            } else {
                somaIdade += idade;
                quantidadeAluno++;
            }
        }

        mediaIdade = somaIdade / quantidadeAluno;

        System.out.println();
        System.out.println("Quantos alunos na turma => " + quantidadeAluno);
        System.out.printf("Média de idade => %.2f", mediaIdade);
    }
}
