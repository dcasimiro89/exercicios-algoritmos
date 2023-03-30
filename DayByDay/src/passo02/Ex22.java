package passo02;

import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {

        final int IDADE_MILITAR = 18;
        int calculoIdade;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        boolean faltaUmAno = IDADE_MILITAR - idade == 1;
        boolean passouUmAno = idade - IDADE_MILITAR == 1;
        boolean anoAlistamento = idade == IDADE_MILITAR;

        if (anoAlistamento) {
            System.out.println(IDADE_MILITAR + " anos, idade de alistamento.");
        } else if (faltaUmAno) {
            System.out.println("Falta 1 ano para o alistamento.");
        } else if (passouUmAno) {
            System.out.println("Passou 1 ano do alistamento.");
        } else if (idade < IDADE_MILITAR) {
            calculoIdade = IDADE_MILITAR - idade;
            System.out.println("Falta " + calculoIdade + " anos para o alistamento.");
        } else {
            calculoIdade = idade - IDADE_MILITAR;
            System.out.println("Já se passaram " + calculoIdade + " anos do alistamento.");
        }
    }

}
