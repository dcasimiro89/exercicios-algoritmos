package passo03;

import java.util.Locale;
import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {

        String resultado;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite sua altura => ");
        double altura = sc.nextDouble();
        System.out.print("Digite seu peso => ");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            resultado = "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 25) {
            resultado = "Peso ideal";
        } else if (imc >= 25 &&  imc < 30) {
            resultado = "Sobrepeso";
        } else if (imc >= 30 && imc < 40) {
            resultado = "Obesidade";
        } else {
            resultado = "Obesidade mórbida";
        }

        System.out.printf("\nIMC: %.2f" , imc);
        System.out.println("\nResposta: " + resultado);
    }
}
