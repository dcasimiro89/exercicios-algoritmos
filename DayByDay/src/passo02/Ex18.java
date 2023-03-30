package passo02;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {

        final int ANO_ATUAL = 2023;
        int anoNasc;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = sc.nextInt();

        boolean podeVotar = (ANO_ATUAL - anoNasc) > 18;

        if (podeVotar) {
            System.out.println("Está apto para votar!");
        } else {
            System.out.println("Não pode votar, pois tem " + (ANO_ATUAL - anoNasc));
        }


    }
}
