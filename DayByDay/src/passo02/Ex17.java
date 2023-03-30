package passo02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        final double VELOCIDADE_PERMITIDA = 80.0;
        final double MULTA = 5.0;
        double calculoMulta;

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.println("[Velocidade permitida 80km/h]");
        System.out.print("Radar [digite a velocidade] => ");
        double radar = sc.nextDouble();

        if (radar > VELOCIDADE_PERMITIDA) {
            double calculoVelocidade = radar - VELOCIDADE_PERMITIDA;
            calculoMulta = calculoVelocidade * MULTA;
            System.out.println("Valor da multa será de" + nf.format(calculoMulta));
        }

    }
}
