package passo02;

import java.util.Scanner;

public class Ex21_AnoBissexto {

    // https://escolakids.uol.com.br/matematica/calculo-do-ano-bissexto.htm

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int anoBissexto;

        System.out.print("Digite o ano para saber se é bissexto => ");
        anoBissexto = sc.nextInt();

        if (anoBissexto % 4 == 0 && anoBissexto % 100 != 0) {
            System.out.println("O ano de " + anoBissexto + " é bissexto.");
        } else if (anoBissexto % 4 != 0 && anoBissexto % 400 == 0) {
            System.out.println("O ano de " + anoBissexto + " é bissexto.");
        } else {
            System.out.println("O ano de " + anoBissexto + " não é bissexto.");
        }
    }
}
