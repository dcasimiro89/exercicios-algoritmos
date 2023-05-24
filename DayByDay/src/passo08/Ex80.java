package passo08;

import java.util.Random;
import java.util.Scanner;

public class Ex80 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int quantidadeChave = 0;
        int[] numero = new int[30];

        System.out.print("Digite o número chave => ");
        int chave = sc.nextInt();

        for (int i = 0; i < numero.length; i++) {
            numero[i] = random.nextInt(15);

            if (numero[i] == chave) {
                System.out.println("Posição chave: " + i);
                quantidadeChave++;
            }
        }
        System.out.println("\nQuantidade repetidades número chave: " + quantidadeChave);






    }
}
