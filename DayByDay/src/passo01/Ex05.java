package passo01;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("A média entre " + nota1 + " e " +
                nota2 + " é igual a " + media);
    }
}
