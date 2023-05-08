package passo08;

public class Ex74 {

    public static void main(String[] args) {

        int[] matriz = new int[10];

        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) {
                matriz[i] = 5;
            } else {
                matriz[i] = 3;
            }
            System.out.print(matriz[i] + " ");
        }

    }
}
