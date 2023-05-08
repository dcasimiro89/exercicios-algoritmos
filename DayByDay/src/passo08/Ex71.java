package passo08;

public class Ex71 {

    public static void main(String[] args) {

        int[] matriz = new int[8];

        int i = 0;
        while (i < matriz.length) {
            matriz[i] = 999;
            i++;
        }

        i = 0;
        while (i < matriz.length) {
            System.out.print(matriz[i] + " ");
            i++;
        }

    }
}
