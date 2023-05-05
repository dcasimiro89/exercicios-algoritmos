package passo07;

import java.util.Scanner;

public class Ex67 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        for (int i = 0; i <= valor; i++) {
            if (i == valor) {
                System.out.print(i + ", FIM!");
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
