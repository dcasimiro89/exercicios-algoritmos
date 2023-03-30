package passo01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        final double VALOR_KM = 0.20;
        final double VALOR_DIA = 90.00;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("Quantos km foram rodados? ");
        double km = sc.nextDouble();
        System.out.print("Quantos dias do veículo alugado? ");
        double qtdDia = sc.nextInt();

        double calculoKm = VALOR_KM * km;
        double calculoDia = VALOR_DIA * qtdDia;

        double valorTotalAluguel = calculoKm + calculoDia;

        System.out.println("Total aluguel: " + nf.format(valorTotalAluguel));

    }

}
