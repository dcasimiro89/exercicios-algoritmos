package passo04;

import java.util.Scanner;

public class Ex49_Array {

    public static void main(String[] args) {

        int i = 0;
        int[] numero = new int[6];
        String[] mensagem = new String[6];
        Scanner sc = new Scanner(System.in);

        while (i < 6) {
            System.out.print((i+1) + ") Digite um número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                numero[i] = num;
                mensagem[i] = "PAR";
            } else {
                numero[i] = num;
                mensagem[i] = "ÍMPAR";
            }
            i++;
        }

        System.out.println();
        i = 0;
        while (i < 6) {
            System.out.println(numero[i] + " => " + mensagem[i]);
            i++;
        }

    }
}
