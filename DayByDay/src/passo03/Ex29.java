package passo03;

import java.util.Scanner;

public class Ex29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.print("Digite seu salário: ");
        double salario = sc.nextDouble();
        System.out.print("Quantos anos de empresa? => ");
        int tempoDeEmpresa = sc.nextInt();
        sc.close();

        if (tempoDeEmpresa < 3) {
            salario += salario * 0.03;
        } else if (tempoDeEmpresa >= 3 && tempoDeEmpresa < 9) {
            salario += salario * 0.125;
        } else {
            salario += salario * 0.20;
        }

        System.out.println("\nNome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Tempo de empresa: " + tempoDeEmpresa);
    }
}
