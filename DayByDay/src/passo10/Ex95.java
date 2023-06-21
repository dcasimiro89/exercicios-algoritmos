package passo10;

import java.util.Scanner;

public class Ex95 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        System.out.println(somador(valor1, valor2));

    }

    public static int somador(int x, int y) {
        return x + y;
    }
}
