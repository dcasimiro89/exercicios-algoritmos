package passo01;

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Equação segundo grau");
        System.out.print("Valor A: ");
        int a = sc.nextInt();
        System.out.print("Valor B: ");
        int b = sc.nextInt();
        System.out.print("Valor C: ");
        int c = sc.nextInt();

        // delta = b2 – 4ac
        int delta = b * b - 4 * a * c;
        System.out.println("Delta: " + delta);
    }
}
