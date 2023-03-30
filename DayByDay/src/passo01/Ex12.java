package passo01;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do produto: R$");
        double valor = sc.nextDouble();

        double desconto = valor - (valor * (5.0/100));

        System.out.printf("Valor do produto: R$%.2f", valor);
        System.out.printf("\nProduto com desconto: R$%.2f", desconto);
    }
}
