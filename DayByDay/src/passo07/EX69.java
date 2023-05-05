package passo07;

import java.util.Scanner;

public class EX69 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número da razão => ");
        int razao = sc.nextInt();
        System.out.print("Progressão Aritmética => ");
        int progAritmetica = sc.nextInt();

        int somaProg = 0;
        for (int i = 0; i < 10; i++) {
            if (i >= 0) {
                if (i == 9) {
                    System.out.print(progAritmetica + " ");
                    somaProg += progAritmetica;
                    progAritmetica += razao;
                    break;
                } else {
                    System.out.print(progAritmetica + " ");
                    somaProg += progAritmetica;
                    progAritmetica += razao;
                }
            }
        }

    }
}
