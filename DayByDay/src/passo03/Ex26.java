package passo03;

import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int valor1 = sc.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = sc.nextInt();

        if (valor1 == valor2) {
            System.out.println("Nao existe valor maior, os dois são iguais!");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro valor é maior: " + valor1);
        } else {
            System.out.println("Segundo valor é maior: " + valor2);
        }
        sc.close();
    }
}
