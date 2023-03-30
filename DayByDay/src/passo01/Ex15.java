package passo01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        final double VALOR_HORA = 25.00;
        final double HORAS_TRABALHADAS = 8.0;
        double valorDia = VALOR_HORA * HORAS_TRABALHADAS;

        System.out.print("Quantos dias trabalhados? ");
        double diasTrabalhados = sc.nextDouble();

        double calculoDiasTrabalhados = diasTrabalhados * valorDia;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("Sálario dos dias trabalhados: " + nf.format(calculoDiasTrabalhados));
    }
}
