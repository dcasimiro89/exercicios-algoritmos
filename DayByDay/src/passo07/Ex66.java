package passo07;

import java.util.Scanner;

public class Ex66 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor * i));
        }
    }
}
