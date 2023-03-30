package passo01;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        System.out.print("Nome do Funcionário: ");
        String funcionario = sc.nextLine();
        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        System.out.println("O funcionario " + funcionario + " tem um salário de " +
                nf.format(salario) + " em Junho.");

    }
}
