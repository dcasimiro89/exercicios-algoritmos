package passo01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        final double DOLLAR = 5.45;

        NumberFormat nfBrasil = NumberFormat.getCurrencyInstance();
        NumberFormat nfUsa = NumberFormat.getCurrencyInstance(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite quantos reais você possui: R$ ");
        double reais = sc.nextDouble();

        double conversao = reais / DOLLAR;

        System.out.println("Com " + nfBrasil.format(reais) + " dará para comprar " + nfUsa.format(conversao));
    }
}
