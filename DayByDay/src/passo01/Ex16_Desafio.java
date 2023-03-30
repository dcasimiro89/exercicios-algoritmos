package passo01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex16_Desafio {

    public static void main(String[] args) {

        final double minutosDeVida = 10.0;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getNumberInstance();

        System.out.print("Quantos cigarros fuma por dia? ");
        double qtdCigarroDia = sc.nextDouble();
        System.out.print("Quantos anos você fuma? ");
        double anosDeFumante = sc.nextDouble();

        double anosEmDias = anosDeFumante * 365.0;
        double tempoDeVida = minutosDeVida * qtdCigarroDia;
        double tempoTotalDeVidaEmDias = anosEmDias * tempoDeVida;
        //System.out.println("Você está perdendo " + tempoDeVida + " minutos de sua vida.");
        System.out.println("Desperdiçando seu tempo de vida em " + nf.format(tempoTotalDeVidaEmDias) + " dias.");
    }
}
