package passo08;

import java.util.Scanner;

public class Ex85 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[5];
        char[] genero = new char[nome.length];
        double[] salario = new double[nome.length];

        for (int i = 0; i < nome.length; i++) {
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Gênero: ");
            genero[i] = sc.next().charAt(0);
            System.out.print("Salário: ");
            salario[i] = sc.nextDouble();
            System.out.println();
        }
        System.out.println("\nGênero Feminino com salário acima de 5000");
        for (int i = 0; i < genero.length; i++) {
            if (genero[i] == 'f' && salario[i] > 5000) {
                System.out.println("Nome: " + nome[i] +
                                " | Gênero: " + genero[i] +
                                " | Salário: " + salario[i]);
            }
        }
    }
}
