package passo01;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();

        System.out.println("O dobro de " + numero + " é " + (numero * 2));
        System.out.printf("A terça parte de %.1f é %.5f", numero, (numero/3));
        //System.out.println("A terça parte de " + numero + " é " + nf.format(numero / 3));
    }
}
