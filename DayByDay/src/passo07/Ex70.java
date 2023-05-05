package passo07;

public class Ex70 {

    public static void main(String[] args) {

        int aux;
        int anterior = 0;
        int proximo = 1;

        for (int i = 1; i < 10; i++) {
            System.out.print(proximo + " ");
            aux = anterior + proximo;
            anterior = proximo;
            proximo = aux;
        }
    }
}
