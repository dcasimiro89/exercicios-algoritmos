package passo04;

import java.util.Scanner;

public class Ex53 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdHomem = 0;
        int qtdMulher = 0;
        int qtdMulherAcima20Anos = 0;
        double totalIdadeGrupo = 0;
        double totalIdadeHomem = 0;
        double mediaGrupo;
        double mediaHomem;

        char genero;
        int idade = 0;

        int i = 0;
        while (i < 5) {
            System.out.print("Qual o seu gênero [m/f] => ");
            genero = sc.next().charAt(0);
            System.out.print("Qual a sua idade? => ");
            idade = sc.nextInt();

            if (genero == 'm') {
                totalIdadeHomem += idade;
                qtdHomem++;
            } else if (genero == 'f') {
                qtdMulher++;
            }

            if (genero == 'f' && idade > 20){
                qtdMulherAcima20Anos++;
            }

            totalIdadeGrupo += idade;
            i++;
        }

        mediaGrupo = totalIdadeGrupo / idade;
        mediaHomem = totalIdadeHomem / qtdHomem;

        System.out.println();
        System.out.println("Quantidade de homens cadastrados: " + qtdHomem);
        System.out.println("Quantidade de mulheres cadastradas: " + qtdMulher);
        System.out.println("Média de idade do grupo: " + mediaGrupo);
        System.out.println("Média idade dos homens: " + mediaHomem);
        System.out.println("Mulheres acima de 20 anos: " + qtdMulherAcima20Anos);

    }
}
