package passo09;

import java.util.Scanner;

public class Ex90 {

    public static void somador(int x, int y) {
        System.out.println(x + y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        somador(valor1, valor2);

    }
}
