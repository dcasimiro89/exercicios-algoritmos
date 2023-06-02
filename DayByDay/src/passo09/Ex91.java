package passo09;

import java.util.Scanner;

public class Ex91 {

    public static void maior(int x, int y) {
        if (x == y) {
            System.out.println(x + " é igual a " + y);
        } else if (x > y) {
            System.out.println(x + " é maior que " + y);
        } else {
            System.out.println(y + " é maior que " + x);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        maior(valor1, valor2);
    }
}
