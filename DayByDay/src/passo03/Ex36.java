package passo03;

import java.util.Scanner;

public class Ex36 {

    public static void main(String[] args) {

        final double DINHEIRO = 0.05;
        double doisPontos = 2.0;
        double cincoPontos = 5.0;
        double dezPontos = 10.0;
        //double resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas horas de atividade física teve no mês? => ");
        double horasAtividadeFisica = sc.nextDouble();

        if (horasAtividadeFisica < 10.0) {  // 2pts por hora
            double calculoAtividade = horasAtividadeFisica * doisPontos * DINHEIRO;
            System.out.printf("R$%.2f", calculoAtividade);
        } else if (horasAtividadeFisica >= 10.0 && horasAtividadeFisica < 20.0) { // 5pts por hora
            double calculoAtividade = horasAtividadeFisica * cincoPontos;
            //resultado = calculoAtividade * DINHEIRO;
            System.out.printf("R$%.2f", calculoAtividade);
        } else { // 10pts por hora
            double calculoAtividade = horasAtividadeFisica * dezPontos;
            System.out.printf("R$%.2f", calculoAtividade);
        }
    }
}
