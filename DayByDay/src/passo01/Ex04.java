package passo01;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();

        System.out.println("A soma entre " + valor1 + " e " + valor2 +
                " é igual a " + (valor1 + valor2) + ".");
    }
}
