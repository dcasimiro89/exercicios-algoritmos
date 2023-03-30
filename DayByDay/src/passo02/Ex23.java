package passo02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex23 {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner sc = new Scanner(System.in);
        double descontoHomem;
        double descontoMulher;

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Sexo: [m ou f]: ");
        char sexo = sc.next().charAt(0);
        System.out.print("Valor das compras: ");
        double valorCompras = sc.nextDouble();

        descontoHomem = valorCompras - (valorCompras * (5.0 / 100));
        descontoMulher = valorCompras - (valorCompras * (13.0 / 100));

        if (sexo == 'm') {
            System.out.println("\nNome: " + nome);
            System.out.println("Sexo: " + sexo);
            System.out.println("Valor da compra: " + nf.format(valorCompras));
            System.out.println("Valor com desconto: " + nf.format(descontoHomem));
        } else {
            System.out.println("\nNome: " + nome);
            System.out.println("Sexo: " + sexo);
            System.out.println("Valor da compra: " + nf.format(valorCompras));
            System.out.println("Valor com desconto: " + nf.format(descontoMulher));
        }
    }
}
