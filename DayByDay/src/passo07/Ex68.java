package passo07;

import java.util.Scanner;

public class Ex68 {

    public static void main(String[] args) {

        int qtdMulheres = 0;
        int homemMais100kg = 0;
        double maiorPesoHomem = 0;
        double somaPesoMulher = 0.0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 8; i++) {
            System.out.print("Gênero [m/f]: ");
            char genero = sc.next().charAt(0);
            System.out.print("Peso: ");
            double peso = sc.nextDouble();

            if (genero == 'f') {
                somaPesoMulher += peso;
                qtdMulheres++;
            } else if (genero == 'm') {
                if (peso > 100.0) {
                    homemMais100kg++;
                }
                if (peso > maiorPesoHomem) {
                    maiorPesoHomem = peso;
                }
            }
            System.out.println();
        }

        double mediaPesoMulher = somaPesoMulher / qtdMulheres;

        System.out.println();
        System.out.println("Quantas mulheres foram cadastradas: " + qtdMulheres);
        System.out.println("Quantos homens pesam mais de 100Kg: " + homemMais100kg);
        System.out.println("A média de peso entre as mulheres: " + String.format("%.2f", mediaPesoMulher));
        System.out.println("O maior peso entre os homens: " + String.format("%.2f", maiorPesoHomem));


    }
}
