package passo03;

import java.util.Locale;
import java.util.Scanner;

public class Ex28 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();

        double area = altura * comprimento;

        if (area < 100.0) {
            System.out.printf("Área: %.2f m²", + area);
            System.out.println("\nTERRENO POPULAR");
        } else if (area >= 100.0 && area <= 500.0) {
            System.out.printf("Área: %.2f m²", + area);
            System.out.println("\nTERRENO MASTER");
        } else {
            System.out.printf("Área: %.2f m²", + area);
            System.out.println("\nTERRENO VIP");
        }

    }
}
