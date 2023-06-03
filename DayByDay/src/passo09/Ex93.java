package passo09;

import java.util.Scanner;

public class Ex93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Início => ");
        int inicio = sc.nextInt();
        System.out.print("Início => ");
        int fim = sc.nextInt();
        System.out.print("Incremento => ");
        int incremento = sc.nextInt();

        contador(inicio, fim, incremento);
    }

    public static void contador(int inicio, int fim, int incremento) {
        while (inicio < fim) {
            System.out.print(inicio + " >> ");
            inicio += incremento;
        }
        System.out.print("Fim");
    }
}
