package passo10;

import java.util.Locale;
import java.util.Scanner;

public class Ex96 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        System.out.printf("\nMédia: %.1f", calcularMedia(nota1, nota2));
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }
}
