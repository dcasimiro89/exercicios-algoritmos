package passo04;

import java.util.Scanner;

public class Ex48 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 1;
        int limite = 7;
        int soma = 0;

        while (i <= limite) {
            System.out.print(i + ") Digite um número: ");
            int numero = sc.nextInt();
            soma += numero;
            i++;
        }
        System.out.println("Soma: " + soma);
    }
}
