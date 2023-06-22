package passo01;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double area;
        double largura = sc.nextDouble();
        double altura = sc.nextDouble();

        area = largura * altura;

        System.out.println("Área: " + area);

        double litroTinta = area / 2.0;

        System.out.printf("Litros necessários: %.2f l", litroTinta);

    }
}
