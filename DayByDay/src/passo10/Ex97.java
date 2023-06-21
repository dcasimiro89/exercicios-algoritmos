package passo10;

import java.util.Scanner;

public class Ex97 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valor1, valor2, valor3;

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

        System.out.println(maior(valor1, valor2, valor3));

    }

    public static int maior(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else if (z > x && z > y) {
            return z;
        }

        return -1;
    }
}
