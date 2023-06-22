package passo03;

import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("lado A: ");
        int a = sc.nextInt();
        System.out.print("lado B: ");
        int b = sc.nextInt();
        System.out.print("lado C: ");
        int c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("EQUILÁTERO");
        } else if (a == b || a == c) {
            System.out.println("ISÓSCELES");
        } else {
            System.out.println("ESCALENO");
        }

    }
}
