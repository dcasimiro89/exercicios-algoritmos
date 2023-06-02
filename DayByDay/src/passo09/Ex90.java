package passo09;

import java.util.Scanner;

public class Ex90 {

    public static int somador(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        int resultado;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        resultado = somador(valor1, valor2);
        System.out.println(resultado);

    }
}
