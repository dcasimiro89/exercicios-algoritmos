package passo03;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex37 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double salarioReajustado = 0d;

        System.out.print("Digite seu salário => ");
        double salario = sc.nextDouble();
        System.out.print("Gênero [m/f] => ");
        char genero = sc.next().charAt(0);
        System.out.print("Tempo de empresa => ");
        int tempoEmpresa = sc.nextInt();

        if (genero == 'f') {
            if (tempoEmpresa < 15) {
                salarioReajustado = salario + salario * (5.0 / 100);
            } else if (tempoEmpresa >= 15 && tempoEmpresa <= 20) {
                salarioReajustado = salario + salario * (12.0 / 100);
            } else {
                salarioReajustado = salario + salario * (23.0 / 100);
            }
        } else if (genero == 'm') {
            if (tempoEmpresa < 20) {
                salarioReajustado = salario + salario * (3.0 / 100);
            } else if (tempoEmpresa >= 20 && tempoEmpresa <= 30) {
                salarioReajustado = salario + salario * (13.0 / 100);
            } else {
                salarioReajustado = salario + salario * (25.0 / 100);
            }
        }

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("====IMPRIMIR FUNCIONÁRIO====");
        System.out.println("Gênero: " + genero);
        System.out.println("Salário Atual: " + nf.format(salario));
        System.out.println("Salário Reajustado: " + nf.format(salarioReajustado));

    }
}
