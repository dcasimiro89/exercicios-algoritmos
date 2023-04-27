package passo05;

import java.util.Scanner;

public class Ex59 {

    public static void main(String[] args) {

        int maiorIdade = 0;
        int mulherMaisJovem = 0;
        int mediaIdadeHomens;
        int qtdHomem = 0;
        int somaIdadeHomem = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Digite seu gênero [m/f] => ");
            char genero = sc.next().charAt(0);
            System.out.print("Digite sua idade => ");
            int idade = sc.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (genero == 'm') {
                somaIdadeHomem += idade;
                qtdHomem++;
            } else if (genero == 'f') {
                if (idade < mulherMaisJovem) {
                    mulherMaisJovem = idade;
                }
            }

            System.out.print("Deseja continuar a cadastrar? [s/n] => ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'n') {
                break;
            } else {
                if (genero == 'f') {
                    mulherMaisJovem = idade;
                }
            }
            System.out.println();
        }

        mediaIdadeHomens = somaIdadeHomem / qtdHomem;
        System.out.println();
        System.out.println("Qual é a maior idade lida => " + maiorIdade);
        System.out.println("Quantos homens foram cadastrados => " + qtdHomem);
        System.out.println("Qual é a idade da mulher mais jovem => " + mulherMaisJovem);
        System.out.println("QUal é a média de idade entre os homens => " + mediaIdadeHomens);


    }

}
