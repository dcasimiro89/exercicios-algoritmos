package passo04;

import java.util.Locale;
import java.util.Scanner;


public class Ex54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double altura;
        double peso;

        double somaAltura = 0;
        int maisDe90Kg = 0;
        int menosDe50KgmenosDe160m = 0;
        int maisDe190mais100Kg = 0;

        int i = 0;
        while (i < 3) {
            System.out.println("\nPessoa " + (i+1));
            System.out.print("Digite sua altura => ");
            altura = sc.nextDouble();
            System.out.print("Digite seu peso => ");
            peso = sc.nextDouble();

            if (peso > 90.0) {
                maisDe90Kg++;
            }
            if (peso < 50.0 && altura < 1.60) {
                menosDe50KgmenosDe160m++;
            }
            if (altura > 1.90 && peso >= 100.0) {
                maisDe190mais100Kg++;
            }

            somaAltura += altura;
            i++;
        }

        double mediaAltura = somaAltura / 7;

        System.out.println();
        System.out.println("Qual foi a média de altura do grupo: " + mediaAltura);
        System.out.println("Quantas pessoas pesam mais de 90Kg: " + maisDe90Kg);
        System.out.println("Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m: " + menosDe50KgmenosDe160m);
        System.out.println("Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg: " + maisDe190mais100Kg);
        sc.close();

    }
}
