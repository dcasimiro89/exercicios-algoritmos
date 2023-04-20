package passo04;

import java.util.Scanner;

public class Ex52_Array {

    public static void main(String[] args) {

        int[] idade = new int[10];
        int i = 0;
        int maisDe18anos = 0;
        int menosDe5anos = 0;
        int maiorIdade = 0;
        int somaIdade = 0;
        double mediaIdade;

        Scanner sc = new Scanner(System.in);

        while (i < idade.length) {
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            somaIdade += idade[i];

            if (idade[i] > 18) {
                maisDe18anos++;
            } else if (idade[i] < 5) {
                menosDe5anos++;
            }

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
            }

            i++;
        }
        mediaIdade = (double)somaIdade / idade.length;
        System.out.println();
        System.out.println("Média de idade do grupo: " + mediaIdade);
        System.out.println("Qtd. pessoas com mais de 18 anos: " + maisDe18anos);
        System.out.println("Qtd. pessoas com menos de 5 anos: " + menosDe5anos);
        System.out.println("Maior idade lida: " + maiorIdade);
    }
}
