package passo04;

import java.util.Random;

public class Ex50 {

    public static void main(String[] args) {

        Random random = new Random();

        int i = 0;
        int[] numero = new int[20];
        //int gerador = random.nextInt(20)+1;

        while (i < numero.length) {
            numero[i] = random.nextInt(20)+1;
            i++;
        }
        //ultimo = numero[numero.length -1];

        i = 0;
        System.out.print("[");

        while (i < numero.length) {
            if (i == numero.length - 1) { // (19)
                System.out.print(numero[i]);
            } else {
                System.out.print(numero[i] + " ");
            }
            i++;
        }
        System.out.println("]");

        i = 0;
        int acimaDeCinco = 0;
        System.out.print("Acima de 5: ");
        while (i < numero.length) {
            if (numero[i] > 5) {
                System.out.print("[" + numero[i] + "] ");
                acimaDeCinco++;
            }
            i++;
        }

        i = 0;
        int divisivelPorTres = 0;
        System.out.print("\nDivisível por 3: ");
        while (i < numero.length) {
            if (numero[i] % 3 == 0) {
                System.out.print("<" + numero[i] + "> ");
                divisivelPorTres++;
            }
            i++;
        }

        System.out.println("\n");
        System.out.println("Qtd. acima de 5: " + acimaDeCinco);
        System.out.println("Qtd. divisiveis por 3: " + divisivelPorTres);
        //System.out.println("Último número do vetor: " + ultimo);

    }
}
