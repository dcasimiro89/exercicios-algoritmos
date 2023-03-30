package passo02;

import java.util.Scanner;

public class Ex19 {

    public static void main(String[] args) {

        double nota1, nota2, media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aluno passou de ano! Média: " +
             media);
        } else {
            System.out.println("Aluno reprovado! Média: " +
                    media);
        }
    }
}
