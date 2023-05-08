package passo08;

public class Ex72 {

    public static void main(String[] args) {

        int[] matriz = new int[10];

        int numero = 5;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = numero;
            numero += 5;
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println();
        for (int x : matriz) {
            System.out.print(x + " ");
        }
    }
}
