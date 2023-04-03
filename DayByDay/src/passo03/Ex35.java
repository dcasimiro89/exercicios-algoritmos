package passo03;

import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {

        final double CARRO_POPULAR = 90.00;
        final double CARRO_LUXO = 150.00;
        double valorPorKm;
        double calculoDias = 0.0;
        double calculoKm = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Tipo de veículo alugado [p: popular/ l: luxo] => ");
        char tipoVeiculo = sc.next().charAt(0);
        System.out.print("Quantos dias de veículo alugado? => ");
        int diasAluguel = sc.nextInt();
        System.out.print("Quantos km percorrido? => ");
        double km = sc.nextDouble();

        if (tipoVeiculo == 'p'){
            if (km < 100) {
                valorPorKm = 0.20;
                calculoDias = CARRO_POPULAR * diasAluguel;
                calculoKm = valorPorKm * km;
            } else {
                valorPorKm = 0.10;
                calculoDias = CARRO_POPULAR * diasAluguel;
                calculoKm = valorPorKm * km;
            }
        } else if (tipoVeiculo == 'l') {
            if (km < 100) {
                valorPorKm = 0.30;
                calculoDias = CARRO_LUXO * diasAluguel;
                calculoKm = valorPorKm * km;
            } else {
                valorPorKm = 0.25;
                calculoDias = CARRO_LUXO * diasAluguel;
                calculoKm = valorPorKm * km;
            }
        }

        double totalAluguel = calculoDias + calculoKm;
        System.out.println();
        System.out.println("Tipo de veículo alugado: " + tipoVeiculo);
        System.out.println("Cálculo dos dias: " + String.format("R$ %.2f", calculoDias));
        System.out.println("Cálculo da quilometragem: " + String.format("R$ %.2f", calculoKm));
        System.out.println("Total aluguel: " + String.format("R$ %.2f", totalAluguel));
    }
}
