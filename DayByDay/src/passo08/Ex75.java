package passo08;

public class Ex75 {

    public static void main(String[] args) {

        int aux;
        int anterior = 0;
        int proximo = 1;
        int[] matriz = new int[16];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = proximo;
            System.out.print(matriz[i] + " ");

            aux = anterior + proximo;
            anterior = proximo;
            proximo = aux;
        }
    }
}
