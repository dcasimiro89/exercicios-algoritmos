package passo03;

import java.util.Scanner;

public class Ex27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1+nota2)/2;

        if (media <= 4.9) {
            System.out.println("REPROVADO, média: " + media);
            } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("RECUPERAÇÃO, média: " + media);
        } else {
            System.out.println("APROVADO, média: " + media);
        }
        sc.close();
    }
}
