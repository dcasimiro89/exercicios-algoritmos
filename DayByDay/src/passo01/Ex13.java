package passo01;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.print("Digite o salário: R$");
        double salario = sc.nextDouble();

        double aumento = salario + (salario * (15.0/100));

        System.out.printf("Salário: R$%.2f", salario);
        System.out.println("\nSalário com aumento: " + nf.format(aumento));
        //System.out.printf("\nSalário com aumento: R$%.2f", aumento);
    }
}
