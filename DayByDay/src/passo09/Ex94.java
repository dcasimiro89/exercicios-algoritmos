package passo09;

import java.util.Scanner;

public class Ex94 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para obter a sequência de Fibonacci => ");
        int sequencia = sc.nextInt();

        fibonacci(sequencia);
    }

    static void fibonacci(int numero) {
        int aux;
        int anterior = 0;
        int proximo = 1;

        for (int i = 0; i < numero; i++) {
            System.out.print(proximo + " >> ");
            aux = anterior + proximo;
            anterior = proximo;
            proximo = aux;
        }
        System.out.print("FIM");
    }
}
