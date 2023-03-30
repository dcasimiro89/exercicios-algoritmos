package passo02;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {

        final double VALOR_ATE200KM = 0.50;
        final double VALOR_MAIS200KM = 0.45;
        double valorViagem;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a distância a ser percorrida: ");
        double distancia = sc.nextDouble();

        if (distancia <= 200.0) {
            valorViagem = distancia * VALOR_ATE200KM;
            System.out.println("Valor viagem: " + nf.format(valorViagem));
        } else if (distancia > 200.0) {
            valorViagem = distancia * VALOR_MAIS200KM;
            System.out.println("Valor viagem: " + nf.format(valorViagem));
        }


    }
}
