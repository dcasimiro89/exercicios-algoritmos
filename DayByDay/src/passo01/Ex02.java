package passo01;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
    }
}
