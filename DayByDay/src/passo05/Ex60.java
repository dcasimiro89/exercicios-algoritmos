package passo05;

import java.util.Scanner;

public class Ex60 {

    public static void main(String[] args) {

        int maiorIdade = 0;
        int mediaIdadeGrupo;
        int qtdHomemAcima30anos = 0;
        int qtdMulherMenos18anos = 0;
        int somaIdadeGrupo = 0;

        String nomeMulherMaisJovem = "";
        String pessoaMaisVelha = "";

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Digite seu gênero [m/f] => ");
            char genero = sc.next().charAt(0);
            System.out.print("Digite seu nome => ");
            String nome = sc.next();
            System.out.print("Digite sua idade => ");
            int idade = sc.nextInt();

            if (idade > maiorIdade) {
                maiorIdade = idade;
                pessoaMaisVelha = nome;
            }

            if (genero == 'm') {
                if (idade > 30) {
                    qtdHomemAcima30anos++;
                }
                somaIdadeGrupo += idade;
            } else if (genero == 'f') {
                if (idade < 18) {
                    nomeMulherMaisJovem = nome;
                    qtdMulherMenos18anos++;
                }
                somaIdadeGrupo += idade;
            }

            System.out.print("Deseja continuar a cadastrar? [s/n] => ");
            char resposta = sc.next().charAt(0);
            if (resposta == 'n') {
                break;
            }
            System.out.println();
        }

        mediaIdadeGrupo = somaIdadeGrupo / (qtdHomemAcima30anos + qtdMulherMenos18anos);
        System.out.println();
        System.out.println("O nome da pessoa mais velha => " + pessoaMaisVelha);
        System.out.println("O nome da mulher mais jovem => " + nomeMulherMaisJovem);
        System.out.println("A média de idade do grupo => " + mediaIdadeGrupo);
        System.out.println("Quantos homens tem mais de 30 anos => " + qtdHomemAcima30anos);
        System.out.println("Quantas mulheres tem menos de 18 anos => " + qtdMulherMenos18anos);
    }
}
