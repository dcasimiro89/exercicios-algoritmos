package passo04;

import java.util.Scanner;

public class Ex53_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdHomem = 0;
        int qtdMulher = 0;
        int qtdMulherAcima20Anos = 0;
        double totalIdadeGrupo = 0;
        double totalIdadeHomem = 0;
        double mediaGrupo;
        double mediaHomem;

        char[] genero = new char[5];
        int[] idade = new int[5];

        int i = 0;
        while (i < 5) {
            System.out.print("Qual o seu gênero [m/f] => ");
            genero[i] = sc.next().charAt(0);
            System.out.print("Qual a sua idade? => ");
            idade[i] = sc.nextInt();

            if (genero[i] == 'm') {
                totalIdadeHomem += idade[i];
                qtdHomem++;
            } else if (genero[i] == 'f') {
                qtdMulher++;
            }

            if (genero[i] == 'f' && idade[i] > 20){
                qtdMulherAcima20Anos++;
            }

            totalIdadeGrupo += idade[i];
            i++;
        }

        mediaGrupo = totalIdadeGrupo / idade.length;
        mediaHomem = totalIdadeHomem / qtdHomem;

        System.out.println();
        System.out.println("Quantidade de homens cadastrados: " + qtdHomem);
        System.out.println("Quantidade de mulheres cadastradas: " + qtdMulher);
        System.out.println("Média de idade do grupo: " + mediaGrupo);
        System.out.println("Média idade dos homens: " + mediaHomem);
        System.out.println("Mulheres acima de 20 anos: " + qtdMulherAcima20Anos);

    }
}
