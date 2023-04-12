package passo04;

import java.util.Scanner;

public class Ex51 {

    public static void main(String[] args) {

        int i = 0;
        double preco;
        double precoMaior = 0;
        Scanner sc = new Scanner(System.in);

        while (i < 5) {
            System.out.print("Digite um valor: ");
            preco = sc.nextDouble();

            if (preco > precoMaior) {
                precoMaior = preco;
            }
            i++;
        }
        System.out.printf("Preço maior => %.2f",precoMaior);
    }
}
