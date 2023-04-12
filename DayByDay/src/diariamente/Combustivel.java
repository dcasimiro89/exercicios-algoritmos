package diariamente;

import java.util.Scanner;

public class Combustivel {

    public static void main(String[] args) {
        int opcao;

        while(true) {
            System.out.println();
            System.out.println("===============MENU=============");
            System.out.println("[1] Consumo veicular");
            System.out.println("[2] Cálculo Combustível por KM");
            System.out.println("[3] Sair");
            System.out.print("=> ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    calcularMediaDoVeiculo();
                    break;
                case 2:
                    calcularViagem();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção errada! Favor escolher entre 1, 2 ou 3.");
            }
        }

    }

    static Scanner sc = new Scanner(System.in);

    public static void calcularMediaDoVeiculo()  {
        System.out.print("Digite quantos litros abastecidos: ");
        double litrosAbastecidos = sc.nextDouble();
        System.out.print("Digite quantos km rodados: ");
        double km = sc.nextDouble();
        double resultado = km / litrosAbastecidos;
        System.out.printf("\nMédia do véiculo é de %.2f l%n", resultado);
    }

    public static void calcularViagem() {
        System.out.print("Digite o valor do combustível: R$");
        double valorCombustivel = sc.nextDouble();
        System.out.print("Digite a média do seu veículo: ");
        double mediaVeiculo = sc.nextDouble();
        System.out.print("Digite a kilometragem da viagem: ");
        double km = sc.nextDouble();
        double calculo = valorCombustivel / mediaVeiculo;
        Double resultado = km * calculo;
        System.out.printf(String.format("\nValor por Km será de R$ %.2f ", calculo));
        System.out.printf(String.format("\nValor da viagem será de R$ %.2f ", resultado));
    }
}
