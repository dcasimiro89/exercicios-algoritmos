package passo04;

import java.util.Random;
import java.util.Scanner;

public class Ex55_Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroPC = random.nextInt(10);


        boolean acertou = false;
        int i = 0;
        while (i < 4) {
            System.out.print("Adivinhe o número do PC => ");
            int guess = sc.nextInt();

            if (guess == numeroPC) {
                System.out.println("Parabéns você acertou!");
                System.out.println("Número escolhido pelo PC foi o " + numeroPC);
                acertou = true;
            } else {
                System.out.println("Errou, tente novamente! Tentativa " + (i+1) + " de 4");
            }

            i++;
            System.out.println();
        }

        if (acertou) {
            System.out.println("Não acertou nenhum número escolhido pelo PC!");
            System.out.println("Número escolhido pelo PC foi o " + numeroPC);
        }
    }
}
