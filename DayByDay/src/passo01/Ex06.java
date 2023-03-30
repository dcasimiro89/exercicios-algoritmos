package passo01;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("O antecessor de " + numero + " é " + (numero - 1));
        System.out.println("O sucessor de " + numero + " é " + (numero + 1));
    }
}
