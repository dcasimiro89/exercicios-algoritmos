package passo05;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex57 {

    public static void main(String[] args) {

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Scanner sc = new Scanner(System.in);
        char resposta;
        double totalSalarioHomem = 0.0;
        double totalSalarioMulher = 0.0;

        while (true) {
            System.out.print("Qual o seu sexo [m/f] => ");
            char sexo = sc.next().charAt(0);
            System.out.print("Qual o salário do funcionário(a) => ");
            double salario = sc.nextDouble();

            if (sexo == 'm') {
                totalSalarioHomem += salario;
            } else {
                totalSalarioMulher += salario;
            }

            System.out.println("Deseja continuar com o cadastro? [s/n] => ");
            resposta = sc.next().charAt(0);

            if (resposta == 'n') {
                break;
            }
        }

        System.out.println();
        System.out.println("Total salário homens: " + nf.format(totalSalarioHomem));
        System.out.println("Total salário mulheres: " + nf.format(totalSalarioMulher));
    }
}
