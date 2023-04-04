package passo04;

import java.util.Scanner;

public class Ex45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = sc.nextInt();
        System.out.print("Digite o último valor: ");
        int ultimoValor = sc.nextInt();
        System.out.print("Digite o incremento: ");
        int incremento = sc.nextInt();

        if (primeiroValor < ultimoValor) {
            System.out.print("Contagem: ");
            while (primeiroValor < ultimoValor) {
                System.out.print(primeiroValor + " ");
                primeiroValor += incremento;
            }
            System.out.print("Acabou!");
        } else {
            System.out.print("Contagem: ");
            while (ultimoValor < primeiroValor) {
                System.out.print(ultimoValor + " ");
                ultimoValor += incremento;
            }
            System.out.print("Acabou!");
        }
    }
}
