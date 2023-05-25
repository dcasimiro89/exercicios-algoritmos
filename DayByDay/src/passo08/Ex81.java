package passo08;

import java.util.Scanner;

public class Ex81 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] idade = new int[8];

        int somaIdade = 0;
        int maiorIdade = 0;
        int posMaioridade = 0;
        int mediaIdade;
        for (int i = 0; i < idade.length; i++) {
            System.out.print("idade["+i+"]: ");
            idade[i] = sc.nextInt();
            somaIdade += idade[i];
        }
        mediaIdade = somaIdade / idade.length;
        System.out.print("Média de idade das pessoas cadastradas: " + mediaIdade);

        System.out.print("\nEm quais posições temos pessoas com mais de 25 anos: ");
        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > 25) {
                System.out.print(i + " ");
            }
            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                posMaioridade = i;
            }
        }
        System.out.print("\nQual foi a maior idade digitada: " + maiorIdade);
        System.out.print("\nEm que posição digitada maior idade: " + posMaioridade);
    }
}
